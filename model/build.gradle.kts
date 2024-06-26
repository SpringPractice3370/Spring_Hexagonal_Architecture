import org.springframework.boot.gradle.tasks.bundling.BootJar

dependencies {
    implementation(project(":util"))
}

tasks.named<Jar>("jar") {
    enabled = true
}

tasks.named<BootJar>("bootJar") {
    enabled = false
}