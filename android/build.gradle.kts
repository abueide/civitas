plugins {
    id("org.jetbrains.compose") version "0.2.0-build132"
    id("com.android.application")
    kotlin("android")
}

group = "com.abysl.civitas"
version = "1.0.0"

repositories {
    google()
    maven { url = uri("https://maven.pkg.jetbrains.space/public/p/compose/dev") }
}

dependencies {
    implementation(project(":compose"))
}

android {
    compileSdkVersion(30)
    defaultConfig {
        applicationId = "com.abysl.civitas.android"
        minSdkVersion(24)
        targetSdkVersion(30)
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}