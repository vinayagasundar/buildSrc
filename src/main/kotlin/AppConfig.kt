object AppConfig {

    const val kotlinVersion = "1.2.70"

    object SdkVersion {
        const val compile = 28
        const val target = 28
        const val min = 21
    }


    object Plugins {
        const val android = "com.android.tools.build:gradle:3.2.0"
        const val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion"
    }

    object Libs {
        object Kotlin {
            const val jvm = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:$kotlinVersion"
            const val coroutineAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:0.30.0"
        }

        object Support {
            private const val lifeCycleVersion = "2.0.0"
            private const val roomVersion = "2.1.0-alpha01"

            const val appCompat = "androidx.appcompat:appcompat:1.0.0-alpha1"
            const val constraitLayout = "androidx.constraintlayout:constraintlayout:1.1.2"

            // ViewModel & LiveData
            const val lifeCycle = "androidx.lifecycle:lifecycle-extensions:$lifeCycleVersion"

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
            const val materialDesign = "com.google.android.material:material:1.0.0-alpha1"

            // RecyclerView
            const val recyclerView = "androidx.recyclerview:recyclerview:1.0.0-alpha1"
        }


        object Network {
            private const val retrofitVersion = "2.4.0"
            private const val okhttpVersion = "3.11.0"
            const val okhttp = "com.squareup.okhttp3:okhttp:$okhttpVersion"
            const val okhttpLogger = "com.squareup.okhttp3:logging-interceptor:$okhttpVersion"
            const val retrofit2 = "com.squareup.retrofit2:retrofit:$retrofitVersion"
            const val retrofit2Mock = "com.squareup.retrofit2:retrofit-mock:$retrofitVersion"
            const val gsonConv = "com.squareup.retrofit2:converter-gson:$retrofitVersion"
        }

        object Image {
            const val picasso = "com.squareup.picasso:picasso:2.71828"
        }

        object Debug {
            const val dbDebug = "com.amitshekhar.android:debug-db:1.0.4"
            const val timerLogger = "com.jakewharton.timber:timber:4.7.1"
        }


        object Test {
            const val junit = "junit:junit:4.12"

            object Mockito {
                const val nhaarmanMock = "com.nhaarman:mockito-kotlin:1.6.0"
            }
        }

        object AndroidTest {
            const val testRunner = "androidx.test:runner:1.1.0-alpha3"
            const val espressoCore = "androidx.test.espresso:espresso-core:3.1.0-alpha3"
        }

        object BlackCatz {
            const val daggerbase = "com.blackcatz:daggerbase:1.2"
        }


        object Dagger {
            private const val version = "2.16"

            const val daggerAndroid = "com.google.dagger:dagger-android:$version"
            const val daggerAndroidSupport = "com.google.dagger:dagger-android-support:$version"

            const val daggerCompiler = "com.google.dagger:dagger-compiler:$version"
            const val daggerAndroidCompiler = "com.google.dagger:dagger-android-processor:$version"
        }
    }
}