plugins {
    id("java-library")
}

group = "org.example"
version = "1.0-SNAPSHOT"
// dependency can be downloaded from the public Maven Central repository mavenCentral().
// Gradle will find and download the source code (as a jar) from Maven Central and use it build the project.
repositories {
    mavenCentral()
}

dependencies {
    // https://mvnrepository.com/artifact/com.fasterxml.uuid/java-uuid-generator
    api("com.fasterxml.uuid:java-uuid-generator:5.1.0")
    // https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core
    api("com.fasterxml.jackson.core:jackson-core:2.10.1")



}

tasks.test {
    useJUnitPlatform()
}
//Gradle Kotlin DSL (Domain Specific Language) is a Kotlin-based language used to configure Gradle builds.
// It provides a more concise and type-safe way to define build scripts compared to the traditional
// Groovy-based Gradle scripts