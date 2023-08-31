package com.loci.adefault

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import coil.compose.AsyncImage
import com.loci.adefault.ui.theme.DefaultTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DefaultTheme {
                MyImageTest1()
                MyImageTest2()
            }
        }
    }
}

@Composable
fun MyImageTest1() {
    Image(
        painter = painterResource(id = R.drawable.untitled),
        contentDescription = "un",
        modifier = Modifier.fillMaxSize()
    )
}

//

@Composable
fun MyImageTest2() {
    AsyncImage(
        model = "https://i.namu.wiki/i/iq-F27IGInLOadHTPlsTo1FgAUmoybnQB2xWIQt-OSUcoSjpMQGOR1mM4LAuljsBnBjltrjIKgBaoP9MlkU6uA.webp",
        contentDescription = "이미지 주소",
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DefaultTheme {
        MyImageTest1()
        MyImageTest2()
    }
}