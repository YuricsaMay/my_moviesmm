package com.example.mymoviesmariamay.ui.screens.main

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import coil.annotation.ExperimentalCoilApi
import com.example.mymoviesmariamay.R
//import com.example.mymoviesmariamay.MediaItem
//import com.example.mymoviesmariamay.getMedia
import com.example.mymoviesmariamay.model.MediaItem.MediaItem
import com.example.mymoviesmariamay.model.MediaItem.getMedia
import com.example.mymoviesmariamay.ui.theme.MyMoviesMariaMayApp
import com.example.mymoviesmariamay.ui.theme.screens.common.Thumb

@ExperimentalFoundationApi
@ExperimentalCoilApi
@Composable
fun MediaList(navController: NavHostController, modifier: Modifier = Modifier){
    //lista Horizontal pelis
    LazyVerticalGrid(
        cells= GridCells.Adaptive(dimensionResource(R.dimen.cell_min_wedith)),
        contentPadding= PaddingValues(dimensionResource(R.dimen.padding_xsmall)),
        modifier= Modifier
        //cells= GridCells.Fixed(2)
    ){
        items(getMedia()) {item->
            MediaListItem(
                item  =item,
                navController,
                modifier =Modifier.padding(dimensionResource(R.dimen.padding_xsmall))
            )

        }
    }
}
@ExperimentalCoilApi
//@Preview(showBackground = true)
@Composable
fun MediaListItem(
    item: MediaItem,
    navController: NavHostController,
    //onClick:() ->Unit,
    modifier: Modifier = Modifier
) {
Card(
    modifier=modifier.clickable{
        navController.navigate("detail/${item.id}")},
    elevation=0.dp,
    border= BorderStroke(1.dp, Color.LightGray)
){
    Column{

        Thumb(item)
        Title(item)
    }
}
}

        //(
        //para una fila,como peliculas
        // modifier=Modifier.width(200.dp)
        //){
        //en este box iran las dos imagenes

        @Composable
        private fun Title(mediaItem:MediaItem){
        Box(
            contentAlignment= Alignment.Center,
            modifier= Modifier
                .fillMaxWidth()
                .background(MaterialTheme.colors.secondary)
                .padding(dimensionResource(R.dimen.padding_medium))
        ){
            Text(
            text=mediaItem.title,
                style= MaterialTheme.typography.h6

            )
        }

    }


@ExperimentalCoilApi
@ExperimentalFoundationApi
@Preview
@Composable
fun MediaListItemPreview(){
            MyMoviesMariaMayApp{
                val mediaItem=MediaItem(1,"Item1","",MediaItem.Type.VIDEO)
                //MediaListItem(mediaItem=mediaItem, navController=)
            }
}


