package com.example.asmgkotlin.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.asmgkotlin.screens.CheckOutScreen
import com.example.asmgkotlin.screens.FavoriteScreen
import com.example.asmgkotlin.screens.HomeScreen
import com.example.asmgkotlin.screens.NotificationScreen
import com.example.asmgkotlin.screens.ProfileScreen
@ExperimentalMaterial3Api
@Composable
fun AppNavigation(navController: NavHostController) {
    val navController = rememberNavController()
    
    Scaffold (
        bottomBar = {
            NavigationBar {
                val navBackStackEntry by navController.currentBackStackEntryAsState()
                val currentDestination = navBackStackEntry?.destination

                listOfNavItems.forEach {  navItems ->
                    NavigationBarItem(
                        selected = currentDestination?.hierarchy?.any { it.route == navItems.route } == true,
                        onClick = {
                                  navController.navigate(navItems.route) {
                                      popUpTo(navController.graph.findStartDestination().id){
                                          saveState = true
                                      }
                                      launchSingleTop = true
                                      restoreState = true
                                  }
                        },
                        icon = {
                               Icon(
                                   imageVector = navItems.icon, 
                                   contentDescription = null)
                        },
                        label = {
                                Text(text = navItems.label)
                        }
                    )
                }
            }
        }
    ) {paddingValues ->  
        NavHost(
            navController = navController,
            startDestination = Screens.HomeScreen.name,
            modifier = Modifier
                .padding(paddingValues)
        ) {
            composable(route = Screens.HomeScreen.name){
                HomeScreen(navController)
            }
            composable(route = Screens.FavoriteScreen.name){
                FavoriteScreen(navController)
            }
            composable(route = Screens.NotificationScreen.name){
                NotificationScreen()
            }
            composable(route = Screens.ProfileScreen.name){
                ProfileScreen(navController)
            }
            composable(Checkout){
                CheckOutScreen(navController)
            }
            composable(FavoriteScreen){
                FavoriteScreen(navController)
            }
            composable(Home){
                HomeScreen(navController)
            }
        }
    }
}


const val Home = "home_screen"
const val FavoriteScreen = "favorite_screen"
const val Checkout = "check_out_screen"
