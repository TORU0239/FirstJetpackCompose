package kr.toru.firstjetpack

import android.graphics.fonts.FontStyle
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kr.toru.firstjetpack.ui.theme.JetpackComposeTheme

/*
* Jetpack Compose basic codelab
* */
class InitActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetToYou("Android")
                }
            }
        }
    }

    @Composable
    fun GreetToYou(name: String) {
        Text(
            text = "Hello $name!!",
            color = Color.White,
            fontFamily = FontFamily.Serif,
            fontStyle = androidx.compose.ui.text.font.FontStyle.Italic,
            fontSize = 30.sp,
            modifier = Modifier.fillMaxWidth()
                .wrapContentWidth(align = Alignment.Start)
                .wrapContentHeight(align = Alignment.Top)
                .background(Color.Cyan)
                .padding(16.dp)
        )
    }

    @Preview(showBackground = true)
    @Composable
    fun DefaultPreview() {
        GreetToYou(name = "Android!!")
    }
}