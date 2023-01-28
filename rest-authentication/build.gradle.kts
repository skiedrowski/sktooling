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

    //provides several implementations of apis with compileOnly dependencies
    testFixturesApi(Deps.payara_embedded)
}