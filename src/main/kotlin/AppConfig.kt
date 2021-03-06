object AppConfig {

    const val kotlinVersion = "1.3.70"

    object SdkVersion {
        const val compile = 29
        const val target = 29
        const val min = 21
    }


    object Plugins {
        const val android = "com.android.tools.build:gradle:4.2.0-alpha16"
        const val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion"
        const val googleService = "com.google.gms:google-services:4.3.2"
    }

    object Libs {
        object Kotlin {
            const val coroutineVersion = "1.0.0"
            const val jvm = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:$kotlinVersion"
            const val coroutineJvm = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutineVersion"
            const val coroutineAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$coroutineVersion"
        }

        object Support {
            private const val lifeCycleVersion = "2.3.0-beta01"
            private const val roomVersion = "2.3.0-alpha03"

            const val appCompat = "androidx.appcompat:appcompat:1.3.0-alpha02"
            const val constraitLayout = "androidx.constraintlayout:constraintlayout:2.1.0-alpha1"

            // ViewModel & LiveData
            const val lifeCycle = "androidx.lifecycle:lifecycle-extensions:2.2.0"
            const val lifeCycleViewModelExt = "androidx.lifecycle:lifecycle-viewmodel-ktx:$lifeCycleVersion"

            // optional - Test helpers for LiveData
            const val lifeCycleTestHelper = "androidx.arch.core:core-testing:$lifeCycleVersion"


            // Room Database
            const val room = "androidx.room:room-runtime:$roomVersion"
            const val roomCompiler = "androidx.room:room-compiler:$roomVersion" // use kapt for Kotlin

            // optional - RxJava support for Room
            const val roomRxJavaSupport = "androidx.room:room-rxjava2:$roomVersion"

            // optional - Guava support for Room, including Optional and ListenableFuture
            const val roomGuavaSupport = "androidx.room:room-guava:$roomVersion"

            // Test helpers
            const val roomTestHelper = "androidx.room:room-testing:$roomVersion"

            // Material Design
            const val materialDesign = "com.google.android.material:material:1.1.0"

            // RecyclerView
            const val recyclerView = "androidx.recyclerview:recyclerview:1.1.0"

            // Custom Tabs
            const val customTabs = "com.android.support:customtabs:28.0.0"
        }


        object Network {
            private const val retrofitVersion = "2.9.0"
            private const val okhttpVersion = "4.9.0"
            const val okhttp = "com.squareup.okhttp3:okhttp:$okhttpVersion"
            const val okhttpLogger = "com.squareup.okhttp3:logging-interceptor:$okhttpVersion"
            const val retrofit2 = "com.squareup.retrofit2:retrofit:$retrofitVersion"
            const val retrofit2Mock = "com.squareup.retrofit2:retrofit-mock:$retrofitVersion"
            const val gsonConv = "com.squareup.retrofit2:converter-gson:$retrofitVersion"
            const val rxJavaAdapter = "com.squareup.retrofit2:adapter-rxjava2:$retrofitVersion"

            const val gson = "com.google.code.gson:gson:2.8.6"
        }

        object Image {
            const val picasso = "com.squareup.picasso:picasso:2.71828"
        }

        object Debug {
            const val dbDebug = "com.amitshekhar.android:debug-db:1.0.4"
            const val timberLogger = "com.jakewharton.timber:timber:4.7.1"
        }


        object Test {
            const val junit = "junit:junit:4.12"

            object Mockito {
                const val nhaarmanMock = "com.nhaarman:mockito-kotlin:1.6.0"
            }
        }

        object AndroidTest {
            const val testRunner = "androidx.test:runner:1.2.0"
            const val espressoCore = "androidx.test.espresso:espresso-core:3.1.0-alpha3"
        }

        object BlackCatz {
            const val daggerbase = "com.blackcatz:daggerbase:1.2"
        }


        object RxJava {
            const val rxJavaVersion = "2.2.15"
            const val rxJavaAndroidVersion = "2.1.1"
            const val rxBindingVersion = "3.1.0"

            const val rxJava = "io.reactivex.rxjava2:rxjava:$rxJavaVersion"

            // Because RxAndroid releases are few and far between, it is recommended you also
            // explicitly depend on RxJava's latest version for bug fixes and new features.
            // (see httpxs://github.com/ReactiveX/RxJava/releases for latest 2.x.x version)
            const val rxJavaAndroid = "io.reactivex.rxjava2:rxandroid:$rxJavaAndroidVersion"

            const val rxBinding = "com.jakewharton.rxbinding3:rxbinding$rxBindingVersion"
            const val rxBindingCore = "com.jakewharton.rxbinding3:rxbinding-core:$rxBindingVersion"
            const val rxBindingAppCompact = "com.jakewharton.rxbinding3:rxbinding-appcompat:$rxBindingVersion"
            const val rxBindingRecyclerView = "com.jakewharton.rxbinding3:rxbinding-recyclerview:$rxBindingVersion"
            const val rxBindingViewPager = "com.jakewharton.rxbinding3:rxbinding-viewpager:$rxBindingVersion"
            const val rxBindingMaterial = "com.jakewharton.rxbinding3:rxbinding-material:$rxBindingVersion"
        }


        object Dagger {
            private const val version = "2.30.1"

            const val dagger = "com.google.dagger:dagger:$version"

            const val daggerAndroid = "com.google.dagger:dagger-android:$version"
            const val daggerAndroidSupport = "com.google.dagger:dagger-android-support:$version"

            const val daggerCompiler = "com.google.dagger:dagger-compiler:$version"
            const val daggerAndroidCompiler = "com.google.dagger:dagger-android-processor:$version"
        }

        object Firebase {
            private const val firebaseVersion = "19.2.0"

            const val analytics = "com.google.firebase:firebase-analytics:17.2.0"

            const val auth = "com.google.firebase:firebase-auth:$firebaseVersion"
            const val serviceAuth = "com.google.android.gms:play-services-auth:17.0.0"

            const val database = "com.google.firebase:firebase-database:$firebaseVersion"
            const val databaseExtension = "com.google.firebase:firebase-database-ktx:$firebaseVersion"
        }
    }
}