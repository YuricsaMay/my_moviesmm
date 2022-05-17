package com.example.mymoviesmariamay.ui.theme.screens.detail

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import coil.annotation.ExperimentalCoilApi
import com.example.mymoviesmariamay.model.MediaItem.getMedia
import com.example.mymoviesmariamay.ui.theme.screens.common.Thumb

@ExperimentalCoilApi
@Composable
//@Preview(showBackground = true, widthDp = 400, heightDp = 400)
fun DetailScreen(mediaId: Int) {
    val mediaItem= remember{getMedia().first{it.id==mediaId}}
    Scaffold(
        topBar={ TopAppBar(title={Text(text= mediaItem.title)})}
    ){padding ->
        Thumb(mediaItem=mediaItem,Modifier.padding(padding))
    }
/*Box(
        modifier= Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Text(
            text= "Detail Screen $mediaId",
            style= MaterialTheme.typography.h4
        )
    }*/
}



