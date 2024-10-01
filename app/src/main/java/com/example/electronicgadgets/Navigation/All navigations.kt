package com.example.electronicgadgets.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.electronicgadgets.DetailedScreen.DetailedScreen
import com.example.electronicgadgets.HomeScreen.HomeScreen
import com.example.electronicgadgets.ThirdScreen.ThirdScreen
import com.example.electronicgadgets.ui.theme.Electric

@Composable
fun AllNavigation(navController:NavHostController
                  ,electric: Electric){

    NavHost(navController = navController,
        startDestination = Route.ElectricMainBox.route) {
        composable(route = Route.ElectricMainBox.route){
            HomeScreen(navController)

        }
        composable(Route.ElectricDetailedBox.route){
            DetailedScreen(navController = navController)

        }
        composable(route =Route.ElectronicFinalBox.route ){
            ThirdScreen(electric)
        }

    }

}