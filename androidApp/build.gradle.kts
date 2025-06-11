plugins {
    id("com.android.application") version "8.4.1"
    id("org.jetbrains.kotlin.android") version "2.1.21"
}

android {
    namespace = "com.example.androidcalc"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.androidcalc"
        minSdk = 21
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_21
        targetCompatibility = JavaVersion.VERSION_21
    }
    kotlin {
        jvmToolchain(21)
    }
}

dependencies {
    implementation(project(":lib"))
    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.12.0")
    implementation("androidx.gridlayout:gridlayout:1.0.0")
}
