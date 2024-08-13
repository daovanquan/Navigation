package com.example.myapplication.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.myapplication.screen.ModelScreen
import com.example.myapplication.screen.Screen

fun NavGraphBuilder.model(navController: NavController) {
    navigation(
        startDestination = Screen.ModelScreen.route,
        route = Screen.ModelScreen.route
    ){
        composable(
            route = Screen.ModelScreen.route
        ){
            ModelScreen()
        }
    }
}