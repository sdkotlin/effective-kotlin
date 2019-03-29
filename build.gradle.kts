import org.gradle.api.JavaVersion.*
import org.gradle.api.tasks.wrapper.Wrapper.*
import org.jetbrains.kotlin.gradle.tasks.*

plugins {
	kotlin("jvm") version "1.3.21"
	id("com.github.ben-manes.versions") version "0.21.0"
}

group = "org.sdkotlin"
version = "1.0-SNAPSHOT"

repositories {
	mavenCentral()
}

dependencies {
	implementation(kotlin("stdlib-jdk8"))
	implementation("org.json:json:20180813")
}

java {
	sourceCompatibility = VERSION_1_8
	targetCompatibility = VERSION_1_8
}

tasks {

	withType<KotlinCompile> {
		kotlinOptions.jvmTarget = VERSION_1_8.toString()
	}

	getByName<Wrapper>("wrapper") {
		gradleVersion = "5.3.1"
		distributionType = DistributionType.ALL
	}
}
