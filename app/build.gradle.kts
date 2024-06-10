plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
    // safe args
    id("androidx.navigation.safeargs")
    // parseLize
    id("kotlin-parcelize")
}

android {
    namespace = "com.skala.flower"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.skala.flower"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    //viewBinding
    val view_binding_property_dalagete = "1.5.9"
    implementation("com.github.kirich1409:viewbindingpropertydelegate-noreflection:$view_binding_property_dalagete")

    // navigation
    val navVersion = "2.7.6"
    implementation("androidx.navigation:navigation-fragment-ktx:$navVersion")
    implementation("androidx.navigation:navigation-ui-ktx:$navVersion")
//    //Lottie
//    val lottieVersion = "6.1.0"
//    implementation ("com.airbnb.android:lottie:$lottieVersion")

    // Glide
    implementation("com.github.bumptech.glide:glide:4.16.0")
}