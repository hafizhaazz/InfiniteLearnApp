package com.example.infinitelearnapp.navigation_buttomnav.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.infinitelearnapp.R
import com.example.infinitelearnapp.data.DataMakanan
import com.example.infinitelearnapp.data.Meal
import com.example.infinitelearnapp.navigation_buttomnav.navigation.Screens


@Composable
fun LazyGridScreen(
    navController: NavController,
    modifier: Modifier = Modifier,
    meal: List<Meal> = DataMakanan.mealList
) {
    Column {
        TopAppBar(text = "Rekomendasi")
        LazyVerticalGrid(
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            columns = GridCells.Adaptive(140.dp),
        ) {
            items(meal, key = { it.id }) {
                MealListItem(meal = it){
                    MealId -> navController.navigate(Screens.DetailPage.name+"/${MealId}")
                }
            }
        }
    }
}


