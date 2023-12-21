package com.example.jetpackcomposecatalog.ui.theme

import androidx.compose.foundation.background
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScaffoldExample(){
    Scaffold (topBar = { MyTopAppBar()}) {

    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyTopAppBar(){
    TopAppBar(title = { Text(text = "Mi primera toolbar")})
}