package com.example.asmgkotlin

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.asmgkotlin.navigation.AppNavigation
import com.example.asmgkotlin.screens.WellcomeScreen


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainNavigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "welcome") {
        composable("welcome") { WellcomeScreen(navController) }
        composable("login") {
            LoginScreen(navController)
        }
        composable("singln") {
            SignInScreenn(navController)
        }
        composable("appNavigation") {
            AppNavigation(navController)
        }
    }
}