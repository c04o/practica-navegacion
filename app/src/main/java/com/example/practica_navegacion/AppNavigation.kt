package com.example.practica_navegacion

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "inicio") {
        composable("inicio") {
            InicioScreen(navController = navController)
        }
        composable("detalle") {
            DetalleScreen(navController = navController)
        }
        composable("perfil") {
            PerfilScreen(navController = navController)
        }
    }
}