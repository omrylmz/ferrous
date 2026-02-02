plugins {
    id("org.jetbrains.intellij.platform") version "2.2.1"
}

group = "com.ferrous"
version = "1.0.1"

repositories {
    mavenCentral()
    intellijPlatform {
        defaultRepositories()
    }
}

dependencies {
    intellijPlatform {
        // Use IntelliJ IDEA Community as base for building
        intellijIdeaCommunity("2024.1")

        // Plugin verifier for compatibility checks
        pluginVerifier()

        // Required for building themes
        instrumentationTools()
    }
}

intellijPlatform {
    pluginConfiguration {
        name = "Ferrous"
        ideaVersion {
            sinceBuild = "241"      // 2024.1+
            untilBuild = provider { null }  // No upper limit
        }
    }

    signing {
        // Optional: Configure if you have a certificate
        // certificateChainFile = file("chain.crt")
        // privateKeyFile = file("private.pem")
        // password = providers.environmentVariable("PRIVATE_KEY_PASSWORD")
    }

    publishing {
        token = providers.environmentVariable("PUBLISH_TOKEN")
        // channels = listOf("stable")  // or "beta", "eap"
    }

    pluginVerification {
        ides {
            recommended()
        }
    }
}

tasks {
    // Theme plugins don't need compilation
    compileJava {
        enabled = false
    }

    compileTestJava {
        enabled = false
    }

    // Build the plugin zip
    buildPlugin {
        archiveBaseName.set("ferrous-theme")
    }
}
