import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.4.10"
    application
}

group = "ocm.github.mrbean355"
version = "2020"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jgrapht:jgrapht-core:1.4.0")
    testImplementation("junit:junit:4.13.1")
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "1.8"
}

application {
    mainClassName = "MainKt"
}