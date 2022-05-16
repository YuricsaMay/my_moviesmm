package com.example.mymoviesmariamay

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.PlayCircleOutline
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Share
import androidx.compose.runtime.*
import androidx.compose.runtime.getValue
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.annotation.ExperimentalCoilApi
import coil.compose.rememberImagePainter
import com.example.mymoviesmariamay.ui.theme.MyMoviesMariaMayTheme
import com.example.mymoviesmariamay.MediaItem.*
import com.example.mymoviesmariamay.ui.MainAppBar
import com.example.mymoviesmariamay.ui.MediaList
import com.example.mymoviesmariamay.ui.theme.MainScreen
import com.example.mymoviesmariamay.ui.theme.MyMoviesMariaMayApp

class MainActivity : ComponentActivity() {
    @ExperimentalFoundationApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyMoviesMariaMayApp {
                    MainScreen()
                   /* val (value,onValueChange)= rememberSaveable{ mutableStateOf("")}
                    StateSample(
                        value= value,
                        onValueChange= onValueChange
                    )*/
                }
            }
        }




}

//sirve para centrar el layout en la pantalla
//@Preview(showBackground = true, widthDp = 400, heightDp = 400)
/*@Composable
fun StateSample(value:String, onValueChange:(String) -> Unit){
    //remembersaveable salva el estado en las rotaciones
    Column(
      modifier=Modifier
          .fillMaxSize()
          .padding(64.dp),
        verticalArrangement = Arrangement.Center
    ){
        TextField(
            value=value,
            onValueChange={ onValueChange(it)},
            modifier=Modifier.fillMaxWidth()
        )
        Text(
            text=value,
            modifier=Modifier
                .fillMaxWidth()
                .background(Color.Yellow)
                .padding(8.dp)
        )
        Button(
            onClick = { onValueChange("")},
            modifier=Modifier.fillMaxWidth(),
            enabled=value.isNotEmpty()
            ){
            Text(text = "Clear")
        }
    }
}*/

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

