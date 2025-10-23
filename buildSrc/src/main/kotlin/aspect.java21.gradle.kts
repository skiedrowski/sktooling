plugins {
    java
}

java.toolchain.languageVersion.set(JavaLanguageVersion.of(21))

//even though we're using a java 21 toolchain, we still need to run gradle itself with java 21 or payara will start with the wrong jdk
if (System.getProperty("java.vm.specification.version") != "21") {
    throw IllegalArgumentException("Build config error. This build needs Java 21, but we've got ${System.getProperty("java.vm.specification.version")}.")
}

tasks.withType<JavaCompile>().configureEach {
    options.encoding = "UTF-8"
    options.isIncremental = true
    options.isWarnings = false
}
