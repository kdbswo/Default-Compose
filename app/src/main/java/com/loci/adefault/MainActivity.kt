package com.loci.adefault

import android.os.Bundle
import android.webkit.WebView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.viewinterop.AndroidView
import com.loci.adefault.ui.theme.DefaultTheme

// WebView
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyWebView("https://www.youtube.com/")

        }
    }
}

@Composable
fun MyWebView(url : String) {
    AndroidView(factory = {
        WebView(it).apply {
            loadUrl(url)
        }
    })
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DefaultTheme {
        MyWebView("https://www.daum.net/")
    }
}