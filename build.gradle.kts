plugins {
    id("java-library")
}

group = "org.example"
version = "1.0-SNAPSHOT"
repositories {
    mavenCentral()
}

dependencies {
    api("com.fasterxml.uuid:java-uuid-generator:5.1.0")
    api("com.fasterxml.jackson.core:jackson-core:2.10.1")



}

tasks.test {
    useJUnitPlatform()
}