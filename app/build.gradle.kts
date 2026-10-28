plugins {
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
        importOrder()
        googleJavaFormat().aosp()
        formatAnnotations()
        trimTrailingWhitespace()
        endWithNewline()
        removeUnusedImports()
    }
}
tasks.getByName("run", JavaExec::class){
    standardInput = System.`in`
}
// test