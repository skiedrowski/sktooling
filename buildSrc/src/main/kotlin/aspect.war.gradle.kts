plugins {
    id("war")
}

tasks.war {
    archiveFileName.set("${project.name}.war")
}
