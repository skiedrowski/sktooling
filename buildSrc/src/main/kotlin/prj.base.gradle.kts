//define prior to mvnpublish plugin config!
group = "com.github.skiedrowski.sktooling"
//version = "NEXT-SNAPSHOT"
version = "20251022"

plugins {
    id("aspect.kotlin")
    id("aspect.java21")
    `java-test-fixtures`
    id("aspect.intern.sourcejar")
    id("aspect.intern.testjar")
    id("aspect.intern.javadocjar")
    id("aspect.intern.mvnpublish")
//    id("aspect.intern.mvnpublish_gh")
//    id("aspect.intern.versions")
    id("aspect.reject.unstable")
}

val config = rootProject.extra["config"] as Map<String, *>

repositories {
    mavenCentral()
}

dependencies {
    testFixturesApi(Deps.junit)
    testFixturesApi(Deps.junit_engine)
    testRuntimeOnly(Deps.junit_launcher)
}

tasks.withType<Test> {
    ignoreFailures = config["ignoreTestFailures"] as Boolean
    maxParallelForks = if (filter.includePatterns.isEmpty()) Runtime.getRuntime().availableProcessors() else 1

    useJUnitPlatform()
}
