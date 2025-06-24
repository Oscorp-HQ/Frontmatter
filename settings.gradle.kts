rootProject.name = "frontmatter"

pluginManagement {
  repositories {
    // still need the Plugin Portal for plugins
    gradlePluginPortal()
    // most artifacts live here
    mavenCentral()
    // but grgit-core:4.1.0 is only on Appodeal’s public Artifactory
    maven {
      url = uri("https://artifactory.appodeal.com/appodeal-public/")
      content {
        includeGroup("org.ajoberstar.grgit")
      }
    }
  }
}
