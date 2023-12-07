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
    }
}

rootProject.name = "HelloWorld"
include(":app")
include(":mod2ihm")
include(":mod2ihm2")
include(":mod3lib")
include(":mod4findviewbyid")
include(":mod4clickbutton")
include(":mod4viewbinding")
include(":mod4databinding")
include(":mod4tprandom")
include(":mod5navigationinterne")
include(":mod5tpcolorme")
include(":mod6intentexplicite")
