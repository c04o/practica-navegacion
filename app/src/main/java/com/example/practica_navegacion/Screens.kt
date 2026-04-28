package com.example.practica_navegacion

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun InicioScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Pantalla 1: Inicio", style = MaterialTheme.typography.headlineMedium)
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = { navController.navigate("detalle") }) {
            Text("Ir a Detalle")
        }
    }
}

@Composable
fun DetalleScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Pantalla 2: Información", style = MaterialTheme.typography.headlineMedium)
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = { navController.navigate("perfil") }) {
            Text("Ver Perfil")
        }
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedButton(onClick = { navController.popBackStack() }) {
            Text("Volver atrás")
        }
    }
}

@Composable
fun PerfilScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Pantalla 3: Resumen", style = MaterialTheme.typography.headlineMedium)
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = {
            // Vuelve al inicio limpiando el historial para no acumular pantallas
            navController.navigate("inicio") {
                popUpTo("inicio") { inclusive = true }
            }
        }) {
            Text("Volver al Inicio (Reiniciar flujo)")
        }
    }
}