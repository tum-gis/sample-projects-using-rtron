[Maven Central Repository](https://mvnrepository.com/artifact/io.rtron/rtron-main):<br />
<a href="https://github.com/tum-gis/sample-projects-using-rtron/actions/workflows/run-java-project.yml" title="Build Status"><img src="https://img.shields.io/github/actions/workflow/status/tum-gis/sample-projects-using-rtron/run-java-project.yml?branch=main&label=java-project&logo=java&style=for-the-badge"></a>
<a href="https://github.com/tum-gis/sample-projects-using-rtron/actions/workflows/run-kotlin-project.yml" title="Build Status"><img src="https://img.shields.io/github/actions/workflow/status/tum-gis/sample-projects-using-rtron/run-kotlin-project.yml?branch=main&label=kotlin-project&logo=kotlin&style=for-the-badge"></a>

[Jitpack Repository](https://jitpack.io/#tum-gis/rtron):<br />
<a href="https://github.com/tum-gis/sample-projects-using-rtron/actions/workflows/run-kotlin-project-jitpack.yml" title="Build Status"><img src="https://img.shields.io/github/actions/workflow/status/tum-gis/sample-projects-using-rtron/run-kotlin-project-jitpack.yml?branch=main&label=kotlin-project-jitpack&logo=kotlin&style=for-the-badge"></a>


# Sample projects using r:trån as a library

[r:trån](https://rtron.io) is a road space model transformer library for OpenDRIVE, CityGML and beyond.

You can use r:trån components as a library.
This includes functionality for reading, transforming, analyzing, writing and so on.

The sample [java-project](java-project) and sample [kotlin-project](kotlin-project) project show a small example implementation of an OpenDRIVE dataset analysis, with an output like this for example:

```bash
OpenDRIVE dataset at sample-projects-using-rtron\datasets\Town01.xodr
Number of roads: 98
Length of all roads: 3923.071893814179
Number of junctions: 12
Number of total geometry elements in plan view: 464

Each id in the element 'road' was used exactly once.
```
The Jitpack variants obtain r:trån from the on-demand package repository [jitpack.io](https://jitpack.io).
