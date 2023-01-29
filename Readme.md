A number of opinonated helper projects.

# Publishing
All projects are published in my github packages repo

```
repositories {
    maven { url "https://maven.pkg.github.com/skiedrowski/sktooling" }
}

dependencies {
    implementation "com.github.skiedrowski.tools.sktooling:kotlin-tools:$ver.kotlin_toole"
    implementation "com.github.skiedrowski.tools.sktooling:cdi-properties:$ver.cdi_properties"
    implementation "com.github.skiedrowski.tools.sktooling:rest-authentication:$ver.rest_authentication"
    implementation "com.github.skiedrowski.tools.sktooling:rest-exceptionmapper:$ver.rest_exceptionmapper"
}

```
# [Kotlin Tools](kotlin-tools/Readme.md)
Written in Kotlin but usable in any JVM language

# [CDI Properties](cdi-properties)
Allows injecting properties files into CDI Beans

# [REST Exceptionmapper](rest-exceptionmapper)
Defines commonly used exception mappers for REST Resources

# [REST Authentication](rest-authentication)
Easy integration of REST Authentication into JAX-RS