package com.example.infinitelearnapp.navigation_buttomnav.screens

import android.health.connect.datatypes.HeightRecord
import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.infinitelearnapp.data.DataMakanan
import com.example.infinitelearnapp.data.DataMakanan.meal
import com.example.infinitelearnapp.data.Meal


@Composable
fun DetailPage(
    modifier : Modifier = Modifier,
    navController: NavController,
    MealId : Int?
    ) {
        val newMealList = DataMakanan.mealList.filter {meal ->
            meal.id == MealId
        }
        Column(
            modifier = Modifier
        ) {
            detailMealContent(newMealList = newMealList, navController = navController)
        }
    }

@Composable
fun detailMealContent(
    newMealList: List<Meal>,
    navController: NavController,
    modifier: Modifier = Modifier
    ) {
    Column(
        modifier = modifier.fillMaxSize()
    ) {
        if (newMealList.isNotEmpty()) {
            TopAppBack(
                text = newMealList.first().title,
                navController = navController,
                modifier = Modifier.fillMaxWidth()
            )
            Column(
                modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
            ) {
                newMealList.forEach { meal   ->
                    Column(
                        modifier = Modifier.padding(vertical = 8.dp)
                    ) {
                        Image(
                            painter = painterResource(id = meal.mealImageId),
                            contentDescription = null,
                            modifier = Modifier.fillMaxWidth()
                                .width(300.dp)
                                .height(200.dp)
                        )
                        Spacer(modifier = Modifier.height(10.dp))
                        Text(text = "Nama : ${meal.title}")
                        Spacer(modifier = Modifier.height(10.dp))
                        Text(text = "Deskripsi : ${meal.description}")
                    }
                }
            }
        } else {
            Text(text = "Tidak ada makanan untuk ditampilkan", modifier = Modifier.fillMaxWidth().padding(16.dp))
        }
    }
}


