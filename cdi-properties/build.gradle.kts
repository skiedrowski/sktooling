plugins {
    id("prj")
}

dependencies {
    implementation(project(":kotlin-tools"))
    compileOnly(Deps.j_cdi_api)

    testFixturesApi(Deps.j_cdi_api)
}