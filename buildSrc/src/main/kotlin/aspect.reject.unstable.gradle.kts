configurations.all {
    resolutionStrategy {
        componentSelection {
            all {
                //TODO remove triplication (buildSrc/build.gradle.kts, aspect.reject.unstable, aspect.intern.versions)

                val exceptions = listOf(
                    Triple("com.google.guava", "listenablefuture", "9999.0-empty-to-avoid-conflict-with-guava"), //dragged in by com.vaadin:copilot:24.9.0
                    Triple("org.glassfish", "jakarta.el", "5.0.0-M1"), // used by ologis-msv3-client ... need better alternative!
                    Triple("org.apache.commons", "commons-fileupload2-core", "2.0.0-M4"), // dragged in by com.vaadin:flow-server:24.9.0
                    Triple("org.apache.commons", "commons-fileupload2-jakarta-servlet6", "2.0.0-M4") // dragged in by com.vaadin:flow-server:24.9.0
                )
                if (exceptions.none { it.first == candidate.group && it.second == candidate.module && it.third == candidate.version }) {
                    val rejectedQualifiers = listOf("alpha", "beta", "rc", "snapshot", "m", "milestone", "preview", "dev", "eap", "cr")
                    if (rejectedQualifiers.any { candidate.version.contains(it, ignoreCase = true) }) {
                        if (candidate.group.startsWith("com.zitecs.") && version.toString().contains("SNAPSHOT", ignoreCase = true)) {
                            // only warn if a zitecs dependency is included in a snapshot version
                            logger.warn("${candidate.group}:${candidate.displayName}:${candidate.version} will be rejected on release because it is considered unstable.")
                        } else {
                            reject("Pre-release version")
                        }
                    }
                }
            }
        }
    }
}