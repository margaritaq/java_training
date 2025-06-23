plugins {
    id("java-library")
}

group = "jt-junior"
version = "1.0-SNAPSHOT"
repositories {
    mavenCentral()
}

dependencies {
    api("com.fasterxml.uuid:java-uuid-generator:5.1.0")
    api("com.fasterxml.jackson.core:jackson-core:2.15.0-rc1")


}

tasks.test {
    useJUnitPlatform()
}