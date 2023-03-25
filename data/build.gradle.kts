plugins {
    id(Plugins.AGP.library)
    id(Plugins.Kotlin.android)
}

android {
    namespace = "com.example.data"
    compileSdk = AppConfig.comparableSdk

    defaultConfig {
        minSdk =  AppConfig.minSdk
        targetSdk = AppConfig.targetSdk

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(project(:domain))
    //room
    implementation(Dependencies.Room.runtime)
    implementation(Dependencies.Room.ktx)x
            kapt(Dependencies.Room.room)

    //DI Hilt
    implementation(Dependencies.DaggerHilt.hilt)
    kapt(Dependencies.DaggerHilt.compiler)

    //Coroutine
    implementation(Dependencies.Coroutine.coroutines)
    implementation(Dependencies.Coroutine.viewmodel)
    implementation(Dependencies.Coroutine.viewbindingpropertydelegate)
}