import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.4.10"
}

group = "me.pjuras"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://dl.bintray.com/kotlin/kotlin-eap")
}

dependencies {
    testImplementation(kotlin("test-junit"))
    implementation(kotlin("stdlib-jdk8"))
    implementation("com.github.kittinunf.fuel:fuel:2.3.1")

    implementation("com.google.oauth-client:google-oauth-client:1.30.4")
    implementation("com.google.http-client:google-http-client:google-http-client-1.32.1.jar")
    implementation("commons-logging:commons-logging:1.2")
    implementation("com.google.code.gson:gson:2.8.5")
    implementation("com.fasterxml.jackson.core:jackson-core:2.9.5")
    implementation ("org.apache.httpcomponents:httpclient:4.5.9")
    implementation ("org.apache.httpcomponents:httpcore:4.4.11")
    implementation ("com.google.code.findbugs:jsr305:3.0.2")
    implementation("com.google.protobuf:protobuf-java:3.6.1")
    implementation ("xpp3:xpp3:1.1.4c")






}

tasks.test {
    useJUnit()
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "1.8"
}
val compileKotlin: KotlinCompile by tasks
compileKotlin.kotlinOptions {
    jvmTarget = "1.8"
}
val compileTestKotlin: KotlinCompile by tasks
compileTestKotlin.kotlinOptions {
    jvmTarget = "1.8"
}