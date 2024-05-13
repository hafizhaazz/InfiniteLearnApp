package com.example.infinitelearnapp.navigation_buttomnav.screens

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import com.example.infinitelearnapp.R
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.navigation.NavController


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBack(
    text: String,
    navController: NavController,
    onBackClick: () ->
    Unit = { navController.navigateUp()},
    modifier: Modifier = Modifier
) {
    TopAppBar(
        title = {
            Text(
                text = text,
                color = Color.Black,
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.Normal
            )
        },
        navigationIcon = {
            IconButton(onClick = onBackClick) {
                Icon(
                    imageVector = Icons.Filled.ArrowBack,
                    contentDescription = "Back"
                )
            }
        },
        colors = topAppBarColors(containerColor = colorResource(id = R.color.orange))
    )
}