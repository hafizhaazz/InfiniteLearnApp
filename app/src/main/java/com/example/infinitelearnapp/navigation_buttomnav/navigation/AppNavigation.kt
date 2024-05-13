package com.example.infinitelearnapp.navigation_buttomnav.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.infinitelearnapp.data.Meal
import com.example.infinitelearnapp.navigation_buttomnav.screens.DetailPage
import com.example.infinitelearnapp.navigation_buttomnav.screens.LazyGridScreen
import com.example.infinitelearnapp.navigation_buttomnav.screens.LazyListScreen
import com.example.infinitelearnapp.navigation_buttomnav.screens.MealListItem
import com.example.infinitelearnapp.navigation_buttomnav.screens.ProfileScreen
import com.example.infinitelearnapp.navigation_buttomnav.screens.SplashScreen

@Composable
fun AppNavigation(){
    val navController : NavHostController = rememberNavController()

    Scaffold (
        bottomBar = {
            NavigationBar {
                val navBackStackEntry : NavBackStackEntry? by navController.currentBackStackEntryAsState()
                val currentDestination : NavDestination? = navBackStackEntry?.destination

                listofNavItems.forEach { navItem: NavItem ->
                    NavigationBarItem(
                        selected = currentDestination?.hierarchy?.any{it.route == navItem.route} == true,
                        onClick = {
                                  navController.navigate(navItem.route){
                                      popUpTo(navController.graph.findStartDestination().id){
                                          saveState = true
                                      }
                                      launchSingleTop = true
                                      restoreState = true
                                  }
                        },
                        icon = {
                            Icon(imageVector = navItem.icon,
                                contentDescription = null)
                        },
                        label = {
                            Text(text = navItem.label)

                        })
                }
            }
        }
    ) {paddingValues -> 
        NavHost(navController = navController,
            startDestination = Screens.SplashScreen.name,
            modifier = Modifier
                .padding(paddingValues)
        ) {
            composable(route = Screens.SplashScreen.name){
                SplashScreen(navController)
            }
            composable(route = Screens.LazyListScreen.name){
                LazyListScreen(navController)
            }
            composable(route = Screens.LazyGridScreen.name){
                LazyGridScreen(navController)
            }
            composable(route = Screens.ProfileScreen.name){
                ProfileScreen()
            }
            composable(route = Screens.DetailPage.name+"/{MealId}", arguments = listOf(
                navArgument("MealId"){
                    type = NavType.IntType
                })){
                navBackStackEntry ->  DetailPage(
                navController = navController, MealId = navBackStackEntry.arguments?.getInt("MealId"))
            }
        }

    }
}

@Preview (showBackground = true)
@Composable
fun NavigationPreview(){
    AppNavigation()
}