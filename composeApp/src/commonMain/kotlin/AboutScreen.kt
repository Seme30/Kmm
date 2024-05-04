import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun AboutScreen(){

    Column{
        TabsView()
        ContentView()
    }
}


@Composable
fun TabsView(){
    TopAppBar(
        title = {Text("About Device")}
    )
}


@Composable
fun ContentView(){

    val items = makeItems()
    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {

        items(items.size){index ->
            RowView(items[index].first, items[index].second)
        }

    }
}


fun makeItems(): List<Pair<String, String>>{
    val platform = Platform()
    platform.logSystemInfo()


    return listOf(
        Pair("OS", "${platform.osName} ${platform.osVersion}"),
        Pair("Device", platform.deviceModel),
        Pair("Density", platform.density)
    )
}

@Composable
private fun RowView(
    title: String,
    subtitle: String,
){
    Column(Modifier.padding(8.dp)){
        Text(
            text = title,
            style = MaterialTheme.typography.body1,
            color = Color.Gray
        )

        Text(
            text = subtitle,
            style = MaterialTheme.typography.body2,
        )

        Divider()
    }

}