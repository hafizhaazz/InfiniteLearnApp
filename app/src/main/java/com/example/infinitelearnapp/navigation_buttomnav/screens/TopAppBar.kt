package com.example.infinitelearnapp.navigation_buttomnav.screens

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import com.example.infinitelearnapp.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBar(
    text: String){
    TopAppBar(
        title = {
            Text(
                text = text,
                color = Color.Black,
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.Normal,
                textAlign = TextAlign.Center
            )
        }, colors = topAppBarColors(containerColor = colorResource(id = R.color.orange))
    )
}






