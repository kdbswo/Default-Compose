package com.loci.adefault

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.loci.adefault.ui.theme.DefaultTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DefaultTheme {
                MyNav()

            }
        }
    }
}

@Composable
fun MyScreen1(navHostController: NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "화면1",
            fontSize = 50.sp
        )
        Button(onClick = {
            navHostController.navigate("myScreen2")
        }) {
            Text(
                text = "2번화면으로 이동",
                fontSize = 30.sp
            )
        }
    }
}

@Composable
fun MyScreen2(navHostController: NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "화면2",
            fontSize = 50.sp
        )
        Button(onClick = {
            navHostController.navigate("myScreen3")
        }) {
            Text(
                text = "3번 화면으로 이동",
                fontSize = 30.sp
            )
        }
    }
}

@Composable
fun MyScreen3(navHostController: NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "화면3",
            fontSize = 50.sp
        )
        Button(onClick = {
            navHostController.navigate("myScreen1")
        }) {
            Text(
                text = "1번 화면으로 이동",
                fontSize = 30.sp
            )
        }
    }
}

@Composable
fun MyNav() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "myScreen1") {
        composable("myScreen1") {
            MyScreen1(navHostController = navController)
        }
        composable("myScreen2") {
            MyScreen2(navHostController = navController)
        }
        composable("myScreen3") {
            MyScreen3(navHostController = navController)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DefaultTheme {
        MyNav()
    }
}