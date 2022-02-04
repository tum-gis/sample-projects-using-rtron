#!/usr/bin/env kscript
/*
@file:MavenRepository("jitpack-releases","https://jitpack.io")
@file:MavenRepository("sonatype-snapshots","https://oss.sonatype.org/content/repositories/snapshots/")
@file:CompilerOpts("-jvm-target 1.8")
@file:DependsOn("com.github.tum-gis.rtron:rtron-main:20e959b0f3")
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
