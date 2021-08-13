/*
 * Copyright 2019-2022 Chair of Geoinformatics, Technical University of Munich
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.rtron.sample.project.kotlin

import io.rtron.readerwriter.opendrive.OpendriveReader
import io.rtron.readerwriter.opendrive.configuration.OpendriveReaderConfiguration
import io.rtron.io.files.Path


fun main(args: Array<String>) {
    require(args.size == 1) { "Expecting exactly one path to an xodr file." }

    val filePath = Path(args.first())
    check(filePath.extension == "xodr") { "File must have an xodr extension." }
    check(filePath.isRegularFile()) { "File must exist." }

    val readConfiguration = OpendriveReaderConfiguration(projectId = filePath.fileNameWithoutExtension.toString())
    val opendriveReader = OpendriveReader(readConfiguration)
    val opendriveModel = opendriveReader.read(filePath)

    println("OpenDRIVE dataset at $filePath")
    println("Number of roads: ${opendriveModel.road.size}")
    val lengthOfAllRoads = opendriveModel.road.sumOf { it.length }
    println("Length of all roads: $lengthOfAllRoads")
    println("Number of junctions: ${opendriveModel.junction.size}")
    println("")

    println("Number of total line elements in plan view: " +
            opendriveModel.road.flatMap { it.planView.geometry }.count { it.isLine() }.toString())
    println("Number of total spiral elements in plan view: " +
            opendriveModel.road.flatMap { it.planView.geometry }.count { it.isSpiral() }.toString())
    println("Number of total arc elements in plan view: " +
            opendriveModel.road.flatMap { it.planView.geometry }.count { it.isArc() }.toString())
    println("Number of total poly3 elements in plan view: " +
            opendriveModel.road.flatMap { it.planView.geometry }.count { it.isPoly3() }.toString())
    println("Number of total paramPoly3 elements in plan view: " +
            opendriveModel.road.flatMap { it.planView.geometry }.count { it.isParamPoly3() }.toString())
    println("")

    val nonUniqueRoadIds = opendriveModel.road.map { it.id }.groupingBy { it }.eachCount().filter { it.value > 1 }
    if (nonUniqueRoadIds.isEmpty()) println("Each id in the element 'road' was used exactly once.")
    else println("The following road ids are not unique: $nonUniqueRoadIds")
}
