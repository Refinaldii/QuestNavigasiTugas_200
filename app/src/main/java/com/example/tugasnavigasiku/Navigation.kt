package com.example.tugasnavigasiku

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.tugasnavigasiku.view.WelcomeScreen
import com.example.tugasnavigasiku.view.ListPesertaScreen

@Composable
fun NavigationApp() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "welcome"
    ) {
        composable("welcome") { WelcomeScreen(navController) }
        composable("list") { ListPesertaScreen(navController) }
    }
}
