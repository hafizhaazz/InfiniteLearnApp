package com.example.infinitelearnapp.navigation_buttomnav.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.ui.graphics.vector.ImageVector

data class NavItem(
    val label: String,
    val icon: ImageVector,
    val route: String
)

val listofNavItems = listOf(
    NavItem(
        label = "Beranda",
        icon = Icons.Default.Home,
        route =Screens.LazyListScreen.name
    ),
    NavItem(
        label = "Rekomendasi",
        icon = Icons.Default.ThumbUp,
        route =Screens.LazyGridScreen.name
    ),
    NavItem(
        label = "Profil",
        icon = Icons.Default.Person,
        route =Screens.ProfileScreen.name
    ),
)