package com.loci.adefault

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.loci.adefault.ui.theme.DefaultTheme

// column
// spacer / divider
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DefaultTheme {
                ColumnTest2()
            }
        }
    }
}

@Composable
fun ColumnTest1() {
    Text(
        text = "안녕하세요1",
        fontSize = 30.sp
    )
    Text(
        text = "반갑습니다1",
        fontSize = 30.sp,
        modifier = Modifier.padding(top = 50.dp)
    )
    Text(
        text = "반갑습니다2",
        fontSize = 30.sp,
        modifier = Modifier.padding(top = 100.dp)
    )
}

@Composable
fun ColumnTest2() {
    Column(
        modifier = Modifier.padding(30.dp)
    ) {
        Text(
            text = "안녕하세요1",
            fontSize = 30.sp
        )
        Spacer(modifier = Modifier.padding(30.dp))
        Divider(thickness = 4.dp, color = Color.Blue)
        Text(
            text = "반갑습니다1",
            fontSize = 30.sp,
        )
        Text(
            text = "반갑습니다2",
            fontSize = 30.sp,
        )
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DefaultTheme {
        ColumnTest2()
    }
}