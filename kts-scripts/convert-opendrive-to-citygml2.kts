#!/usr/bin/env kscript
/*
@file:CompilerOpts("-jvm-target 1.8")
@file:DependsOn("io.rtron:rtron-main:1.2.2")
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
        flattenGenericAttributeSets = true
        discretizationStepSize = 0.5
    }

    writeCitygmlModel(citygmlModel) {
        versions = setOf(CitygmlVersion.V2_0)
    }
}
