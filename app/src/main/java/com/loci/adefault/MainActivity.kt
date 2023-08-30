package com.loci.adefault

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.loci.adefault.ui.theme.DefaultTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DefaultTheme {
                // A surface container using the 'background' color from the theme
                MyBtn()
            }
        }
    }
}

@Composable
fun MyBtn() {

    val context = LocalContext.current

    Button(
        onClick = {
            Log.d("Main", "onClick")
            Toast.makeText(context, "클릭완료", Toast.LENGTH_LONG).show()
        },
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Yellow,
            contentColor = Color.Blue
        ),
        modifier = Modifier
            .width(200.dp)
            .height(300.dp)
    ) {
        Text(
            text = "버튼버튼 버튼버튼 버튼버튼버튼버튼버튼버튼",
            lineHeight = 30.sp,
            fontSize = 30.sp,
            color = Color.Red       // 마지막으로 설정한색으로 적용됨 (46번째줄과 중복됨)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DefaultTheme {
        MyBtn()
    }
}