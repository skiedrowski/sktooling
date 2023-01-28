repositories {
    gradlePluginPortal() // so that external plugins can be resolved in dependencies section
}

plugins {
    `kotlin-dsl`
}

dependencies {
    //cannot use Deps here
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.8.0") //version must match Deps.kotlin
    implementation("org.jetbrains.kotlin:kotlin-noarg:1.8.0") //version must match Deps.kotlin
    implementation("org.jetbrains.kotlin:kotlin-allopen:1.8.0") //version must match Deps.kotlin
}
