import org.springframework.boot.gradle.tasks.bundling.BootJar

val jar: Jar by tasks
val bootJar: BootJar by tasks

jar.enabled = false
bootJar.enabled = false

extra["springCloudVersion"] = "2023.0.3"

subprojects {
    dependencies {
        implementation("org.springframework.cloud:spring-cloud-starter-netflix-eureka-server")
    }

    dependencyManagement {
        imports {
            mavenBom("org.springframework.cloud:spring-cloud-dependencies:${property("springCloudVersion")}")
        }
    }
}
