import org.gradle.api.tasks.wrapper.Wrapper
import org.gradle.kotlin.dsl.named

tasks.named<Wrapper>("wrapper") {
    gradleVersion = "7.6"
    distributionType = Wrapper.DistributionType.ALL
}
