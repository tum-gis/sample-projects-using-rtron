# Sample projects using r:trån as a library

[r:trån](https://rtron.io) is a road space model transformer library for OpenDRIVE, CityGML and beyond.

With r:trån you can write transformation recipes as run scripts, but also consume r:trån's components as a library.
This includes functionality for reading, transforming, analyzing, writing and so on.
 
The [sample-java-project](sample-java-project) and [sample-kotlin-project](sample-kotlin-project) project show a small example implementation of an OpenDRIVE dataset analysis, with an output like this for example:

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
