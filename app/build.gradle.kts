plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {


    buildFeatures {
        dataBinding  = true
    }
    namespace = "com.example.userprofilefetcher"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.userprofilefetcher"
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
                getDefaultProguardFile("proguard-android-optimize.txt") ,
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
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
    dependencies {
        dependencies {
            implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.5.1")
            implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.5.1")
            implementation("com.squareup.retrofit2:retrofit:2.9.0")
            implementation("com.squareup.retrofit2:converter-gson:2.9.0")
            implementation("androidx.databinding:databinding-runtime:7.2.1")
            implementation ("androidx.core:core:1.15.0")
            implementation ("androidx.core:core-ktx:1.15.0")
        }
    }
}