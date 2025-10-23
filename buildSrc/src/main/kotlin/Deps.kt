object Ver {
    const val kotlin = "2.2.20" //also update buildSrc/build.gradle.kts
    const val jee_api = "10.0.0"
    const val j_cdi_api = "4.0.1"
    const val j_ws_rs_api = "3.1.0"
    const val j_annotation_api = "2.1.1"
    const val j_xml_bind_api = "4.0.0"
    
    //test
    const val junit = "5.14.0"
    const val mockk = "1.14.6"
    const val kotest_assertions = "5.9.1"

    const val yasson = "3.0.4"
    const val jersey = "3.1.10"
}

object Deps {
    const val kt_stdlib = "org.jetbrains.kotlin:kotlin-stdlib:${Ver.kotlin}"
    const val jee_api = "jakarta.platform:jakarta.jakartaee-api:${Ver.jee_api}"
    const val j_cdi_api = "jakarta.enterprise:jakarta.enterprise.cdi-api:${Ver.j_cdi_api}"
    const val j_ws_rs_api = "jakarta.ws.rs:jakarta.ws.rs-api:${Ver.j_ws_rs_api}"
    const val j_annotation_api = "jakarta.annotation:jakarta.annotation-api:${Ver.j_annotation_api}"
    const val j_xml_bind_api = "jakarta.xml.bind:jakarta.xml.bind-api:${Ver.j_xml_bind_api}"

    //test
    const val junit = "org.junit.jupiter:junit-jupiter-api:${Ver.junit}"
    const val junit_engine = "org.junit.jupiter:junit-jupiter-engine:${Ver.junit}"
    const val junit_launcher = "org.junit.platform:junit-platform-launcher"

    const val mockk = "io.mockk:mockk:${Ver.mockk}"
    const val kotest_assertions = "io.kotest:kotest-assertions-core:${Ver.kotest_assertions}"

    const val yasson = "org.eclipse:yasson:${Ver.yasson}"
    const val jersey_common = "org.glassfish.jersey.core:jersey-common:${Ver.jersey}"
}
