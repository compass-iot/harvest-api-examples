import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar
import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "2.0.0"
    id("com.github.johnrengelman.shadow") version "7.1.2" // plugin to build fat JAR
    application
}

group = "com.compassiot"
version = "1.0-SNAPSHOT"

application {
    mainClass.set("$group.MainKt")
}

kotlin {
    jvmToolchain(11)
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(11))
    }
}

repositories {
    mavenCentral()
    maven {
        name = "buf"
        url = uri("https://buf.build/gen/maven")
    }
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.9.0-RC")
    implementation("com.google.protobuf:protobuf-kotlin:4.28.3")
    implementation("build.buf.gen:compassiot_harvest_connectrpc_kotlin:0.7.0.1.20241101062807.949a8a380248")
    implementation("build.buf.gen:compassiot_harvest_protocolbuffers_kotlin:28.3.0.1.20241101062807.949a8a380248")
    implementation("build.buf.gen:compassiot_model_protocolbuffers_kotlin:28.3.0.1.20241101062807.d40d2bc2d0b0")
    implementation("com.squareup.okhttp3:okhttp:4.10.0")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    compilerOptions.jvmTarget.set(JvmTarget.JVM_11)
}

val shadowJar = tasks.named<ShadowJar>("shadowJar") {
    // Must be set otherwise we'll run into ManifestNotFound exception
    manifest {
        attributes(mapOf(
            "Main-Class" to application.mainClass
        ))
    }

    // Explicit identifier that this is a fat / uber JAR.
    // Also enable zip64 for compression
    archiveClassifier.set("standalone")
    isZip64 = true

    // The function that does all the magic in embedding to fat JAR
    mergeServiceFiles()
}

tasks.build {
    dependsOn(shadowJar)
}
