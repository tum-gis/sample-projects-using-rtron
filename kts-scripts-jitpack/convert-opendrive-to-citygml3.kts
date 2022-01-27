#!/usr/bin/env kscript
/*
@file:MavenRepository("jitpack-releases","https://jitpack.io")
@file:CompilerOpts("-jvm-target 1.8")
@file:DependsOn("com.github.tum-gis.rtron:rtron-main:develop-SNAPSHOT")
*/

import io.rtron.main.project.processAllFiles
import io.rtron.readerwriter.citygml.CitygmlVersion

processAllFiles(
    inInputDirectory = "../datasets",
    withExtension = "xodr",
    toOutputDirectory = "../datasets_output"
)
{
    val opendriveModel = readOpendriveModel(inputFilePath)
    val roadspacesModel = transformOpendrive2Roadspaces(opendriveModel) {
        crsEpsg = 0 // local coordinate system
    }
    val citygmlModel = transformRoadspaces2Citygml(roadspacesModel) {
        mappingBackwardsCompatibility = false
    }

    writeCitygmlModel(citygmlModel) {
        versions = setOf(CitygmlVersion.V3_0)
    }
}
