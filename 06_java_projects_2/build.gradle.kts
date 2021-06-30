plugins {
    kotlin("jvm") version "1.5.20"
    `java-library`
}

repositories {
    mavenCentral()
}

tasks.withType<Wrapper> {
    gradleVersion = "7.1"
    distributionType = Wrapper.DistributionType.BIN
}
