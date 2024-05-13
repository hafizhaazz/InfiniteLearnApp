package com.example.infinitelearnapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import com.example.infinitelearnapp.data.Meal
import com.example.infinitelearnapp.navigation_buttomnav.navigation.AppNavigation
import com.example.infinitelearnapp.navigation_buttomnav.screens.LazyListScreen
import com.example.infinitelearnapp.ui.theme.InfiniteLearnAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            InfiniteLearnAppTheme {
                AppNavigation()
            }
        }
    }
}




