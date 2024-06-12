package com.example.asmgkotlin.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.ui.graphics.vector.ImageVector

data class NavItems(
    val label: String,
    val icon: ImageVector,
    val route: String
)

val listOfNavItems = listOf(
    NavItems(
        label = "Home",
        icon = Icons.Default.Home,
        route = Screens.HomeScreen.name
    ),
    NavItems(
        label = "Favorite",
        icon = Icons.Default.Favorite,
        route = Screens.FavoriteScreen.name
    ),
    NavItems(
        label = "Notification",
        icon = Icons.Default.Notifications,
        route = Screens.NotificationScreen.name
    ),
    NavItems(
        label = "Profile",
        icon = Icons.Default.Person,
        route = Screens.ProfileScreen.name
    ),
)