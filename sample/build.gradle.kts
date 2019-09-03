plugins {
    id(Plugins.android_application)
    kotlin(Plugins.kotlin_android)
    kotlin(Plugins.kotlin_android_extensions)
    kotlin(Plugins.kapt)
}

android {
    compileSdkVersion(AndroidSdk.sdk_compile)

    defaultConfig {
        applicationId = "net.furkanakdemir.noticeboardsample"
        minSdkVersion(AndroidSdk.sdk_minimum)
        targetSdkVersion(AndroidSdk.sdk_target)
        versionCode = AndroidSdk.version_code
        versionName = AndroidSdk.version_name
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = true
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
}

dependencies {
    implementation(project(":noticeboard"))

    implementation(Deps.kotlin)
    implementation(Deps.appcompat)
    implementation(Deps.constraintlayout)
}
