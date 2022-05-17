package com.example.mymoviesmariamay.ui.theme.screens.main

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import coil.annotation.ExperimentalCoilApi
//import com.example.mymoviesmariamay.ui.MainAppBar
//import com.example.mymoviesmariamay.ui.MediaList
import com.example.mymoviesmariamay.ui.screens.main.MainAppBar
import com.example.mymoviesmariamay.ui.screens.main.MediaList
import com.example.mymoviesmariamay.ui.theme.MyMoviesMariaMayApp
@ExperimentalCoilApi
@ExperimentalFoundationApi
@Composable
fun MainScreen(navController: NavHostController) {
    MyMoviesMariaMayApp {
        Scaffold(
            topBar = { MainAppBar() }
            //para el menu lo de hamburguesa
            /*navigationIcon={
                                  IconButton(onClick={/*TODO*/}){
                                      Icon(
                                          imageVector=Icons.Default.Menu,
                                          contentDescription=null
                                        )
                                    }
                            }*/
        ) { padding ->
            MediaList(navController, Modifier.padding(padding))
        }
    }
}


