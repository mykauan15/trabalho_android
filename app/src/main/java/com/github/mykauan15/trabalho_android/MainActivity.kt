package com.github.mykauan15.trabalho_android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.github.mykauan15.trabalho_android.screens.AlmocoScreen
import com.github.mykauan15.trabalho_android.screens.JantarScreen
import com.github.mykauan15.trabalho_android.screens.LanchesScreen
import com.github.mykauan15.trabalho_android.screens.MenuReceitasScreen
import com.github.mykauan15.trabalho_android.screens.PerfilScreen
import com.github.mykauan15.trabalho_android.ui.theme.Trabalho_AndroidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Trabalho_AndroidTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    val navController = rememberNavController()

                    NavHost(
                        navController = navController,
                        startDestination = "menu",
                    ) {
                        composable(route = "jantar") {
                            JantarScreen(modifier = Modifier.padding(innerPadding), navController)
                        }
                        composable(route = "almoco") {
                            AlmocoScreen(modifier = Modifier.padding(innerPadding), navController)
                        }
                        composable(route = "menu") {
                            MenuReceitasScreen(modifier = Modifier.padding(innerPadding), navController)
                        }
                        composable(route = "lanches") {
                            LanchesScreen(modifier = Modifier.padding(innerPadding), navController)
                        }
                        composable(route = "perfil") {
                            PerfilScreen(modifier = Modifier.padding(innerPadding), navController)
                        }
                    }
                }
            }
        }
    }
}