import org.springframework.boot.gradle.tasks.bundling.BootJar

val jar: Jar by tasks
val bootJar: BootJar by tasks

jar.enabled = true
bootJar.enabled = true

dependencies {
    implementation("org.springframework.cloud:spring-cloud-starter-openfeign")
}

tasks.bootJar {
    archiveBaseName.set("client-a")
}