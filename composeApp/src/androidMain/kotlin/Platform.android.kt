import android.content.res.Resources
import android.os.Build
import android.util.Log
import org.jetbrains.compose.resources.Resource
import kotlin.math.round

actual class Platform actual constructor(){

    actual val osName: String
        get() = "Android"
    actual val osVersion: String
        get() = "${Build.VERSION.SDK_INT}"
    actual val deviceModel: String
        get() = "${Build.MANUFACTURER} ${Build.MODEL}"
    actual val density: String
        get() = round(Resources.getSystem().displayMetrics.density).toString()

    actual fun logSystemInfo() {
        Log.d(
            "daily pulse",
            "($osName, $osVersion, $deviceModel, $density)"
            )
    }

}