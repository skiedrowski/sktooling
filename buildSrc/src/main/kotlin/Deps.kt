object Ver {
    const val kotlin = "1.8.0" //also update buildSrc/build.gradle.kts

    //test
    const val junit = "5.9.2"
    const val mockk = "1.13.4"
    const val kotest_assertions = "5.5.4"
}

object Deps {
    const val kt_stdlib_jdk8 = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Ver.kotlin}"

    const val junit = "org.junit.jupiter:junit-jupiter-api:${Ver.junit}"
    const val junit_engine = "org.junit.jupiter:junit-jupiter-engine:${Ver.junit}"

    const val mockk = "io.mockk:mockk:${Ver.mockk}"
    const val kotest_assertions = "io.kotest:kotest-assertions-core:${Ver.kotest_assertions}"
}
