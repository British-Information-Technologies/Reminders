plugins {
	id("com.android.application")
	id("org.jetbrains.kotlin.android")
	id("com.google.dagger.hilt.android")
	kotlin("kapt")
}

android {
	namespace = "org.british_information_technologies.reminders"
	compileSdk = 33

	defaultConfig {
		applicationId = "org.british_information_technologies.reminders"
		minSdk = 29
		targetSdk = 33
		versionCode = 1
		versionName = "1.0"

		testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
	}

	buildTypes {
		release {
			isMinifyEnabled = false
			proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
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

	implementation("androidx.core:core-ktx:1.9.0")

	implementation("androidx.appcompat:appcompat:1.6.1")

	implementation("com.google.android.material:material:1.8.0")
	implementation("androidx.compose.material3:material3:1.1.2")

	implementation("com.google.dagger:hilt-android:2.44")
	kapt("com.google.dagger:hilt-android-compiler:2.44")

	implementation("androidx.constraintlayout:constraintlayout:2.1.4")
	implementation("androidx.navigation:navigation-fragment-ktx:2.5.3")
	implementation("androidx.navigation:navigation-ui-ktx:2.5.3")

}