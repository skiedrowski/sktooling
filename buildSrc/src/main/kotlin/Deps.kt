object Ver {
    const val kotlin = "1.8.0" //also update buildSrc/build.gradle.kts
    const val jee_api = "10.0.0"
    const val j_cdi_api = "4.0.1"
    const val j_ws_rs_api = "3.1.0"
    const val j_annotation_api = "2.1.1"
    const val j_xml_bind_api = "4.0.0"
    
    //test
    const val junit = "5.9.2"
    const val mockk = "1.13.4"
    const val kotest_assertions = "5.5.4"

    const val yasson = "3.0.2"
    const val jersey = "3.1.0"
}

object Deps {
    const val kt_stdlib_jdk8 = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Ver.kotlin}"
    const val jee_api = "jakarta.platform:jakarta.jakartaee-api:${Ver.jee_api}"
    const val j_cdi_api = "jakarta.enterprise:jakarta.enterprise.cdi-api:${Ver.j_cdi_api}"
    const val j_ws_rs_api = "jakarta.ws.rs:jakarta.ws.rs-api:${Ver.j_ws_rs_api}"
    const val j_annotation_api = "jakarta.annotation:jakarta.annotation-api:${Ver.j_annotation_api}"
    const val j_xml_bind_api = "jakarta.xml.bind:jakarta.xml.bind-api:${Ver.j_xml_bind_api}"

    //test
    const val junit = "org.junit.jupiter:junit-jupiter-api:${Ver.junit}"
    const val junit_engine = "org.junit.jupiter:junit-jupiter-engine:${Ver.junit}"

    const val mockk = "io.mockk:mockk:${Ver.mockk}"
    const val kotest_assertions = "io.kotest:kotest-assertions-core:${Ver.kotest_assertions}"

    const val yasson = "org.eclipse:yasson:${Ver.yasson}"
    const val jersey_common = "org.glassfish.jersey.core:jersey-common:${Ver.jersey}"
}
