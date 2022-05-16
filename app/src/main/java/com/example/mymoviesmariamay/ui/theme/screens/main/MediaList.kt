package com.example.mymoviesmariamay.ui.screens.main

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayCircleOutline
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.annotation.ExperimentalCoilApi
import coil.compose.rememberImagePainter
import com.example.mymoviesmariamay.R
//import com.example.mymoviesmariamay.MediaItem
//import com.example.mymoviesmariamay.getMedia
import com.example.mymoviesmariamay.model.MediaItem.MediaItem
import com.example.mymoviesmariamay.model.MediaItem.getMedia

@ExperimentalFoundationApi
@ExperimentalCoilApi
//@Preview
@Composable
fun MediaList(modifier: Modifier = Modifier){
    //lista Horizontal pelis
    LazyVerticalGrid(
        contentPadding= PaddingValues(dimensionResource(R.dimen.padding_xsmall)),
        cells= GridCells.Adaptive(dimensionResource(R.dimen.cell_min_wedith)),
        modifier= Modifier
        //cells= GridCells.Fixed(2)
    ){
        items(getMedia()) {item ->
            MediaListItem(item, Modifier.padding(dimensionResource(R.dimen.padding_xsmall)))
        }
    }
}
@ExperimentalCoilApi
//@Preview(showBackground = true)
@Composable
fun MediaListItem(item: MediaItem, modifier: Modifier = Modifier){
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
                .height(dimensionResource(R.dimen.cell_thumb_height))
                .fillMaxWidth(),
            // contentAlignment= Alignment.Center
            //.background(color = Color.Red)
        ){
            Image(
                painter= rememberImagePainter(
                    data=item.thumb
                    //builder={
                    //transformations(BlurTransformation(LocalContext.current))
                    //crossfade(true)

                ),
                contentDescription= null,
                modifier= Modifier.fillMaxSize(),
                contentScale= ContentScale.Crop
            )
            if(item.type == MediaItem.Type.VIDEO) {
                Icon(
                    imageVector = Icons.Default.PlayCircleOutline,
                    contentDescription = null,
                    modifier = Modifier
                        .size(dimensionResource(R.dimen.cell_play_icon_size))
                        .align(Alignment.Center),
                    tint = Color.White
                )
                //Icon(painter=painterResource(id=R.drawable.ic_launcher_foreground))
            }
        }
        Box(
            contentAlignment= Alignment.Center,
            modifier= Modifier
                .fillMaxWidth()
                .background(MaterialTheme.colors.secondary)
                .padding(dimensionResource(R.dimen.padding_medium))
        ){
            Text(text=item.title,
                style= MaterialTheme.typography.h6

            )
        }

    }

}
@ExperimentalCoilApi
@ExperimentalFoundationApi
@Preview
@Composable
fun MediListPreview(){
    MediaList()
}