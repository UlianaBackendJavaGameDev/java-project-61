plugins {
    java
    application
    id("com.diffplug.spotless") version "6.25.0"
    id("com.github.ben-manes.versions") version "0.51.0"
}

repositories {
    mavenCentral()
}

dependencies {
}

testing {
}

application {
    mainClass.set("hexlet.code.App")
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}
spotless{
    java{
        googleJavaFormat()
        trimTrailingWhitespace()
        endWithNewline()
        removeUnusedImports()
    }
}
