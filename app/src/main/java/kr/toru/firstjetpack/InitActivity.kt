package kr.toru.firstjetpack

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kr.toru.firstjetpack.ui.theme.JetpackComposeTheme

/*
* Jetpack Compose basic codelab
* */
class InitActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTheme {
                MyApp(modifier = Modifier.fillMaxWidth())
            }
        }
    }

    @Composable
    fun GreetToYou(name: String) {
        val expanded = remember { mutableStateOf(false) }
        val extraPadding = if (expanded.value) 48.dp else 0.dp
        Surface(
            color = MaterialTheme.colorScheme.primary,
            modifier = Modifier.padding(vertical = 4.dp, horizontal = 8.dp)
        ) {
            Row(modifier = Modifier.padding(24.dp)) {
                Column(modifier = Modifier.weight(1f).padding(bottom = extraPadding)) {
                    Text(
                        text = "Hello,",
                        color = Color.White
                    )
                    Text(
                        text = "$name!!",
                        color = Color.White
                    )
                }
                ElevatedButton(
                    onClick = {
                        expanded.value = !expanded.value
                    }
                ) {
                    Text(text = if (expanded.value )"Show less" else "Show more")
                }
            }
        }
    }

    @Composable
    private fun MyApp(
        modifier: Modifier = Modifier,
        names: List<String> = listOf("World", "Compose")
    ) {
        Column(modifier = modifier) {
            for (name in names) {
                GreetToYou(name = name)
            }
        }
    }

    @Preview(showBackground = true, widthDp = 320)
    @Composable
    fun DefaultPreview() {
        JetpackComposeTheme {
            MyApp()
        }
    }
}