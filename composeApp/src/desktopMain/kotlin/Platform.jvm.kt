actual class Platform {
    actual val osName: String
        get() = System.getProperty("os.name")
    actual val osVersion: String
        get() = System.getProperty("os.version")
    actual val deviceModel: String
        get() = "Desktop"
    actual val density: String
        get() = "1" // Desktops don't have a concept of density

    actual fun logSystemInfo() {
        println("($osName, $osVersion, $deviceModel, $density)")
    }
}
