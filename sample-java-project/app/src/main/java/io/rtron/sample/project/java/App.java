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

package io.rtron.sample.project.java;

import io.rtron.model.opendrive.road.Road;
import io.rtron.readerwriter.opendrive.OpendriveReader;
import io.rtron.readerwriter.opendrive.configuration.OpendriveReaderConfiguration;
import io.rtron.io.files.Path;

public class App {

    public static void main(String[] args) {
        if (args.length != 1)
            throw new IllegalArgumentException("Expecting exactly one path to an xodr file.");

        var filePath = new Path(args[0]);

        var readConfiguration = new OpendriveReaderConfiguration(filePath.getFileNameWithoutExtension().toString());
        var opendriveReader = new OpendriveReader(readConfiguration);
        var opendriveModel = opendriveReader.read(filePath);

        System.out.println("OpenDRIVE dataset at " + filePath);
        System.out.println("Number of roads: " + opendriveModel.getRoad().size());
        var lengthOfAllRoads = opendriveModel.getRoad().stream().mapToDouble(Road::getLength).sum();
        System.out.println("Length of all roads: " + lengthOfAllRoads);
        System.out.println("Number of junctions: " + opendriveModel.getJunction().size());

        // TODO: continue with some more examples
    }
}
