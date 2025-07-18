/*
 * This file was generated by the Gradle 'init' task.
 *
 * This generated file contains a sample Kotlin library project to get you started.
 * For more details on building Java & JVM projects, please refer to https://docs.gradle.org/8.14/userguide/building_java_projects.html in the Gradle documentation.
 */

plugins {
    // Apply the Kotlin Multiplatform plugin.
    alias(libs.plugins.kotlin.multiplatform)
}


kotlin {
    jvm()
    js(IR) {
        browser()
        nodejs()
    }

    jvmToolchain(21)

    sourceSets {
        val commonMain by getting {
            dependencies {
                api(libs.commons.math3)
                implementation(libs.guava)
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
        val jvmMain by getting
        val jvmTest by getting
        val jsMain by getting
        val jsTest by getting
    }
}

