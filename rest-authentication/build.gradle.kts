plugins {
    id("prj")
}

dependencies {
    implementation(project(":kotlin-tools"))
    implementation(project(":cdi-properties"))

    compileOnly(Deps.j_cdi_api)
    compileOnly(Deps.j_ws_rs_api)
    compileOnly(Deps.j_annotation_api)
    compileOnly(Deps.j_xml_bind_api)

    testFixturesApi(Deps.j_cdi_api)
    testFixturesApi(Deps.j_ws_rs_api)
    testFixturesApi(Deps.j_annotation_api)
    testFixturesApi(Deps.j_xml_bind_api)
    testFixturesApi(Deps.jersey_common)
}