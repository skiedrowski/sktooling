plugins {
    id("prj.base")
}

dependencies {
    compileOnly(Deps.jee_api)
    compileOnly(Deps.j_xml_bind_api)

    testFixturesApi(Deps.jee_api)
    testFixturesApi(Deps.yasson)
    testFixturesApi(Deps.jersey_common)
}