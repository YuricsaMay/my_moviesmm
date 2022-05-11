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
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
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
            Text(text="Title 1",
                style=MaterialTheme.typography.h6
            )
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
        Text(
            text= "Hello World",
            //NUMERO DE LINEAS DEFINIDOS
            //maxLines=1,
            //el softwrap hace un recorte del texto para que no salga a medias
            //softWrap= false,
            //overflow= TextOverflow.Ellipsis,
            style= MaterialTheme.typography.h4.copy(
                shadow= Shadow(
                    offset= Offset(5f,5f),
                    blurRadius=5f,
                    color=Color.Black.copy(alpha=0.5f)
                )
            )
            //textAlign= TextAlign.Right
            //lineHeight=2.em
            //em la altura de una letra
            //Parametros que se pueden modificar el text
            //color=Color.Red
            //fontSize=25.sp
            //fontStyle= FontStyle.Italic
        //letra negrita
       // fontWeight=FontWeight.ExtraBold
        //fontFamily =FontFamily.Monospace
        //letterSpacing=5.sp
        //decoración
       // textDecoration = TextDecoration.LineThrough
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

