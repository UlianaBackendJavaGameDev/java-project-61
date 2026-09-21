plugins {
    java
    application
}

repositories {
    mavenCentral()
}

dependencies {
}

testing {
}

application {
    mainClass.set("org.example.App")
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}
