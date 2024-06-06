plugins {
    `android-library`
    `kotlin-android`
}

apply(from = "$rootDir/base-module.gradle")

android {
    namespace = "ktk.vishdroid.onboarding_domain"
}

dependencies {
    implementation(project(Modules.core))
}