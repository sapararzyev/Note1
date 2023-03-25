plugins {
    id(Plugins.AGP.library)
    id(Plugins.Kotlin.jvm)
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_7
    targetCompatibility = JavaVersion.VERSION_1_7
}

dependencies{

    implementation(Dependencies.Coroutine.coroutines)
    implementation(Dependencies)
}