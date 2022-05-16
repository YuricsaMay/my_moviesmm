package com.example.mymoviesmariamay

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayCircleOutline
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.annotation.ExperimentalCoilApi
import coil.compose.rememberImagePainter
import com.example.mymoviesmariamay.ui.theme.MyMoviesMariaMayTheme
import com.example.mymoviesmariamay.MediaItem.*

class MainActivity : ComponentActivity() {
    @ExperimentalFoundationApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyMoviesMariaMayTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MediaList()
                }
            }
        }
    }
}
@Preview
@Composable
fun (){

}
@ExperimentalFoundationApi
@ExperimentalCoilApi
//@Preview
@Composable
fun MediaList(){
    //lista Horizontal pelis
    LazyVerticalGrid(
        contentPadding=PaddingValues(2.dp),
        cells= GridCells.Adaptive(150.dp)
        //cells= GridCells.Fixed(2)
    ){
        items(getMedia()) {item ->
            MediaListItem(item, Modifier.padding(2.dp))
        }
    }
}
@ExperimentalCoilApi
//@Preview(showBackground = true)
@Composable
fun MediaListItem(item: MediaItem, modifier:Modifier = Modifier){
    Column(
        modifier=modifier
    ){

    //(
        //para una fila,como peliculas
       // modifier=Modifier.width(200.dp)
    //){
                //en este box iran las dos imagenes
        Box(
            modifier= Modifier
                .height(200.dp)
                .fillMaxWidth(),
           // contentAlignment= Alignment.Center
                //.background(color = Color.Red)
        ){
        Image(
            painter=rememberImagePainter(
                data=item.thumb
            //builder={
                //transformations(BlurTransformation(LocalContext.current))
            //crossfade(true)

        ),
            contentDescription= null,
            modifier=Modifier.fillMaxSize(),
            contentScale= ContentScale.Crop
        )
            if(item.type == Type.VIDEO) {
                Icon(
                    imageVector = Icons.Default.PlayCircleOutline,
                    contentDescription = null,
                    modifier = Modifier.size(92.dp).align(Alignment.Center),
                    tint = Color.White
                )
                //Icon(painter=painterResource(id=R.drawable.ic_launcher_foreground))
            }
        }
        Box(
            contentAlignment=Alignment.Center,
            modifier=Modifier
                .fillMaxWidth()
                .background(MaterialTheme.colors.secondary)
                .padding(16.dp)
        ){
            Text(text=item.title,
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

