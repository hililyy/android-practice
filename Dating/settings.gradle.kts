pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        jcenter() //추가
        maven {
            url = uri("https://jitpack.io") // 이렇게 추가
        }
    }
}

rootProject.name = "Dating"
include(":app")
