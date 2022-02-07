buildscript {
    repositories {
        google()
        mavenCentral()
        maven("https://s01.oss.sonatype.org/service/local/repositories/comapollographql-1004/content/")
    }

    dependencies {
        classpath("com.android.tools.build:gradle:4.1.3")
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:2.3.5")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.0")
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
        maven("https://s01.oss.sonatype.org/service/local/repositories/comapollographql-1004/content/")
    }
}

