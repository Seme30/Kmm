actual class Platform {
    actual val osName: String
        get() = "Browser"
    actual val osVersion: String
        get() = "Unknown" // Browsers don't expose OS version
    actual val deviceModel: String
        get() = "Browser"
    actual val density: String
        get() = "1" // Browsers don't have a concept of density

    actual fun logSystemInfo() {
        println("($osName, $osVersion, $deviceModel, $density)")
    }

}
