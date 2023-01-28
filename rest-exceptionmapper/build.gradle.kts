plugins {
    id("prj")
}

dependencies {
    compileOnly(Deps.jee_api)
    compileOnly(Deps.j_xml_bind_api)

    testFixturesApi(Deps.payara_embedded)
}