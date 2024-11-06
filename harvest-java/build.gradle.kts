import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar

plugins {
    id("java")
    id("com.github.johnrengelman.shadow") version "7.1.2" // plugin to build fat JAR
    application
}

group = "com.compassiot"
version = "1.0-SNAPSHOT"

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(11))
    }
}

application {
    mainClass.set("$group.Main")
}

repositories {
    mavenCentral()
    maven {
        name = "buf"
        url = uri("https://buf.build/gen/maven")
    }
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("com.google.protobuf:protobuf-java:4.28.3")
    implementation("io.grpc:grpc-core:1.68.1")
    implementation("io.grpc:grpc-protobuf:1.68.1")
    implementation("io.grpc:grpc-stub:1.68.1")
    implementation("io.grpc:grpc-netty-shaded:1.68.1")
    implementation("build.buf.gen:compassiot_harvest_grpc_java:1.68.1.1.20241101062807.949a8a380248")
    implementation("build.buf.gen:compassiot_harvest_protocolbuffers_java:28.3.0.1.20241101062807.949a8a380248")
    implementation("build.buf.gen:compassiot_model_protocolbuffers_java:28.3.0.1.20241101062807.d40d2bc2d0b0")
}

tasks.test {
    useJUnitPlatform()
}

tasks.named<ShadowJar>("shadowJar") {
    // Must be set otherwise we'll run into ManifestNotFound exception
    manifest {
        attributes(mapOf(
            "Main-Class" to application.mainClass
        ))
    }

    // Explicit identifier that this is a fat / uber JAR. Also enable zip64 for compression
    archiveClassifier.set("standalone")
    isZip64 = true

    // The function that does all the magic in embedding to fat JAR
    mergeServiceFiles()
}

tasks.build {
    dependsOn("shadowJar")
}
