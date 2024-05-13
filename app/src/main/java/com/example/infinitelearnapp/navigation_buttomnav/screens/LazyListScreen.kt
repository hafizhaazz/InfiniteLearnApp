package com.example.infinitelearnapp.navigation_buttomnav.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.infinitelearnapp.R
import com.example.infinitelearnapp.data.DataMakanan
import com.example.infinitelearnapp.navigation_buttomnav.navigation.Screens

@Composable
fun LazyListScreen(
    navController: NavController
) {
    val meal = remember { DataMakanan.mealList }
    Column {
        TopAppBar(text = "List Makanan")
        LazyRow(
            contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
        ) {
            items(
                items = meal,
                key = {it.id},
                itemContent = {
                    MealListItem(meal = it){
                        MealId -> navController.navigate(Screens.DetailPage.name+"/${MealId}")}
                }
            )
        }
        Spacer(modifier = Modifier.height(19.dp))
        LazyColumn(
            contentPadding = PaddingValues(horizontal = 20.dp, vertical = 20.dp)
        ) {
            items(
                items = meal,
                key = {it.id},
                itemContent = {
                    MealListItem(meal = it){
                        MealId -> navController.navigate(Screens.DetailPage.name+"/${MealId}")
                    }
                }
            )
        }
    }
}
        