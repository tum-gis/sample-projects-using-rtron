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

plugins {
    id("org.jetbrains.kotlin.jvm") version "1.5.21"
    application
}

repositories {
    mavenCentral()
    maven(url = "https://jitpack.io")
}

dependencies {
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    val rtronVersion = "develop-SNAPSHOT"
    implementation("com.github.tum-gis.rtron:rtron-main:${rtronVersion}")
    implementation("com.github.tum-gis.rtron:rtron-readerwriter:${rtronVersion}")
    implementation("com.github.tum-gis.rtron:rtron-model:${rtronVersion}")
    implementation("com.github.tum-gis.rtron:rtron-io:${rtronVersion}")
}

application {
    mainClass.set("io.rtron.sample.project.kotlin.AppKt")
}
