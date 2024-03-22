plugins {
    kotlin("jvm")
    id("convention.publishing")
    id("convention.testing")
}

group = "io.github.vacxe.danger.kotlin"

dependencies {
    implementation("systems.danger:danger-kotlin-sdk:1.2")
    implementation("com.google.code.gson:gson:2.9.1")

    implementation(project(":core"))
}