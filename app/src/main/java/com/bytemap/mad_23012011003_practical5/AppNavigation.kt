package com.bytemap.mad_23012011003_practical5

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.bytemap.mad_23012011003_practical5.screen.components.LoginScreen
import com.bytemap.mad_23012011003_practical5.screen.components.RegisterUI

@Composable
fun AppNavigation(context: Context) {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "login"
    ) {
        composable("login") {
            LoginScreen(context, navController)
        }
        composable("register") {
            RegisterUI(navController)
        }
    }
}