package com.app.template_compose_mvi_cleanarch.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.app.template_compose_mvi_cleanarch.presentation.feature.greeting.GreetingScreen

@Composable
fun AppNavHost(navController: NavHostController = rememberNavController()) {
    NavHost(navController = navController, startDestination = "greeting") {
        composable("greeting") {
            GreetingScreen()
        }
    }
}
