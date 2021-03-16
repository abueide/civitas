buildscript {
    repositories {
        gradlePluginPortal()
        jcenter()
        google()
        mavenCentral()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.20")
        classpath("com.android.tools.build:gradle:4.0.1")
    }
}

group = "com.abysl.civitas"
version = "1.0.0"

allprojects {
    repositories {
        jcenter()
        mavenCentral()
    }
}