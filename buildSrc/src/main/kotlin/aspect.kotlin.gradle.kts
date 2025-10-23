plugins {
    `java-test-fixtures`
    kotlin("jvm")

    id("org.jetbrains.kotlin.plugin.noarg")
    id("org.jetbrains.kotlin.plugin.allopen")
}

kotlin {
    compilerOptions {
        freeCompilerArgs.add("-Xjvm-default=all-compatibility")
    }
}

configure<org.jetbrains.kotlin.allopen.gradle.AllOpenExtension> {
    annotation("com.github.skiedrowski.tools.kt.compiler.allopen.AllOpen")
    annotation("jakarta.ejb.Singleton")
    annotation("jakarta.ejb.Stateless")
    annotation("jakarta.enterprise.context.ApplicationScoped")
    annotation("jakarta.enterprise.context.RequestScoped")
    annotation("jakarta.persistence.Entity")
    annotation("jakarta.ws.rs.ApplicationPath")
    annotation("jakarta.enterprise.context.RequestScoped")
    annotation("jakarta.ws.rs.Path")
}


configure<org.jetbrains.kotlin.noarg.gradle.NoArgExtension> {
    annotation("com.github.skiedrowski.tools.kt.compiler.noarg.NoArg")
    annotation("jakarta.ejb.Singleton")
    annotation("jakarta.ejb.Stateless")
    annotation("jakarta.persistence.Entity")
    annotation("jakarta.ws.rs.Path")
    annotation("jakarta.xml.bind.annotation.XmlRootElement")
    annotation("jakarta.xml.bind.annotation.XmlAccessorType")
}

dependencies {
    implementation(Deps.kt_stdlib)

    // kotlin-reflect is (just) used by mockito-kotlin. However the version should match kotlin version, so we need
    // to explicitly to avoid conflicting versions on the (test) classpath
//    testFixturesApi(Deps.kt_reflect)
//    testFixturesApi(Deps.mockito_kotlin)
//    testFixturesApi(Deps.hamkrest)

    testFixturesApi(Deps.mockk)
    testFixturesApi(Deps.kotest_assertions)
}
