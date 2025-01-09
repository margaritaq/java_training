plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"
// dependency can be downloaded from the public Maven Central repository mavenCentral().
// Gradle will find and download the source code (as a jar) from Maven Central and use it build the project.
repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    // https://mvnrepository.com/artifact/com.fasterxml.uuid/java-uuid-generator
    implementation("com.fasterxml.uuid:java-uuid-generator:5.0.0")


}

tasks.test {
    useJUnitPlatform()
}
//Gradle Kotlin DSL (Domain Specific Language) is a Kotlin-based language used to configure Gradle builds.
// It provides a more concise and type-safe way to define build scripts compared to the traditional
// Groovy-based Gradle scripts