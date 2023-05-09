plugins { `java-library` }

dependencies {
    implementation("org.spigotmc:spigot:1.10.2-R0.1-SNAPSHOT")

    api(project(":abstraction"))
}

java {
    targetCompatibility = JavaVersion.VERSION_1_8
    sourceCompatibility = JavaVersion.VERSION_1_8
}
