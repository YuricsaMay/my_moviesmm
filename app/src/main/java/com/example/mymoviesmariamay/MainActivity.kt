package com.example.mymoviesmariamay

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.mymoviesmariamay.ui.theme.MyMoviesMariaMayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyMoviesMariaMayTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String,modifier:Modifier = Modifier) {
    Text(text = "Hello $name!",modifier = modifier)
}

@Preview(
    showBackground = true,
    name="Android Greeting",
widthDp=400,
heightDp=200
)
@Composable
fun DefaultPreview() {
    MyMoviesMariaMayTheme {
        Box(
            modifier= Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ){
            Greeting("Maria")
            Greeting(name="Android", modifier=Modifier.align(Alignment.BottomEnd))
        }

    }
}