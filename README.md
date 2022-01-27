[Maven Central Repository](https://mvnrepository.com/artifact/io.rtron/rtron-main):

<a href="https://github.com/tum-gis/sample-projects-using-rtron/actions/workflows/run-java-project.yml" title="Build Status"><img src="https://img.shields.io/github/workflow/status/tum-gis/sample-projects-using-rtron/Run%20java-project/main?label=java-project&logo=java&style=for-the-badge"></a>
<a href="https://github.com/tum-gis/sample-projects-using-rtron/actions/workflows/run-kotlin-project.yml" title="Build Status"><img src="https://img.shields.io/github/workflow/status/tum-gis/sample-projects-using-rtron/Run%20kotlin-project/main?label=kotlin-project&logo=kotlin&style=for-the-badge"></a>
<a href="https://github.com/tum-gis/sample-projects-using-rtron/actions/workflows/run-kts-scripts.yml" title="Run Status"><img src="https://img.shields.io/github/workflow/status/tum-gis/sample-projects-using-rtron/Run%20sample-kts-scripts/main?label=kts-scripts&logo=kotlin&style=for-the-badge"></a>

[Jitpack Repository](https://jitpack.io/#tum-gis/rtron):

<a href="https://github.com/tum-gis/sample-projects-using-rtron/actions/workflows/run-kotlin-project-jitpack.yml" title="Build Status"><img src="https://img.shields.io/github/workflow/status/tum-gis/sample-projects-using-rtron/Run%20kotlin-project/main?label=kotlin-project-jitpack&logo=kotlin&style=for-the-badge"></a>
<a href="https://github.com/tum-gis/sample-projects-using-rtron/actions/workflows/run-kts-scripts-jitpack.yml" title="Run Status"><img src="https://img.shields.io/github/workflow/status/tum-gis/sample-projects-using-rtron/Run%20sample-kts-scripts/main?label=kts-scripts-jitpack&logo=kotlin&style=for-the-badge"></a>


# Sample projects using r:trån as a library

[r:trån](https://rtron.io) is a road space model transformer library for OpenDRIVE, CityGML and beyond.

With r:trån you can write transformation recipes like in sample [kts-scripts](kts-scripts), but also consume r:trån's components as a library.
This includes functionality for reading, transforming, analyzing, writing and so on.

The sample [java-project](java-project) and sample [kotlin-project](kotlin-project) project show a small example implementation of an OpenDRIVE dataset analysis, with an output like this for example:

```bash
OpenDRIVE dataset at sample-projects-using-rtron\datasets\Town01.xodr
Number of roads: 98
Length of all roads: 3923.071893814179
Number of junctions: 12

Number of total line elements in plan view: 352
Number of total spiral elements in plan view: 0
Number of total arc elements in plan view: 112
Number of total poly3 elements in plan view: 0
Number of total paramPoly3 elements in plan view: 0

Each id in the element 'road' was used exactly once.
```
The Jitpack variants obtain r:trån from the on-demand package repository [jitpack.io](https://jitpack.io).
