package com.example.mymoviesmariamay

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
                    ButtonText()
                }
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun MediaItem(){
    Column{
        //en este box iran las dos imagenes
        Box(
            modifier= Modifier
                .height(200.dp)
                .fillMaxWidth()
                .background(color = Color.Red)
        ){

        }
        Box(
            contentAlignment=Alignment.Center,
            modifier=Modifier
                .fillMaxWidth()
                .background(MaterialTheme.colors.secondary)
                .padding(16.dp)
        ){
            Text("Title 1")
        }

    }

}
@Composable
fun Greeting(name: String,modifier:Modifier = Modifier) {
    Text(text = "Hello $name!",
        modifier = modifier)
}
//para hacer un boton
//@Preview(showBackground = true, widthDp=200, heightDp=100)
@Composable
fun ButtonText(){
    Box(modifier=Modifier.fillMaxSize(),
    contentAlignment= Alignment.Center
    ){
        Text("Hello world",
        modifier=Modifier
            .clickable{/*TODO*/}
            .background(Color.Cyan)
            .border(width=2.dp,color=Color.Blue)
            .padding(horizontal=16.dp,vertical=8.dp)


        )
    }

}
//@Preview(showBackground = true, name="Android Greeting")
@Composable
fun DefaultPreview(){
    MyMoviesMariaMayTheme {
        Row(
            modifier=Modifier
                .fillMaxWidth()
                .height(200.dp),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ){
            Greeting(
                name="Android",
                modifier=Modifier
                    .background(Color.LightGray)
            )
            Greeting(
                name="Maria",
                modifier=Modifier
                    .background(Color.Yellow)
            )
        }

    }
}

