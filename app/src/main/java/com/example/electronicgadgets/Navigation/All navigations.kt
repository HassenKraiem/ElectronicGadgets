package com.example.electronicgadgets.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.electronicgadgets.DetailedScreen.DetailedScreen
import com.example.electronicgadgets.HomeScreen.HomeScreen
import com.example.electronicgadgets.productInformationScreen.ProductInformationScreen
import com.example.electronicgadgets.ui.theme.DataSource
import com.example.electronicgadgets.ui.theme.Electric

@Composable
fun AllNavigation(
    navController: NavHostController, electric: Electric
) {
    NavHost(
        navController = navController,
        startDestination = Route.ElectricMainBox.route
    ) {
        composable(
            route = Route.ElectricMainBox.route,
        ) {
            HomeScreen(navController)
        }

        composable(
            route = Route.ElectricDetailedBox.route,
            arguments = listOf(navArgument(
                name = "id1"
            ) {
                type = NavType.StringType

            })
        ) {
            val arg1 = it.arguments?.getString("id1").toString()
            val electric2 = DataSource().listOfProducts.first { it.id == arg1 }
            DetailedScreen(navController = navController, list = electric2.list)
        }

        composable(route = Route.ElectronicFinalBox.route,
            arguments = listOf(navArgument(
            name = "id"
        ) {
            type = NavType.StringType
        })) {
            val arg = it.arguments?.getString("id").toString()
            val electric1 = DataSource().listOfaAllElements.first { it.id == arg }
            ProductInformationScreen(electric1 ?: electric, navController = navController)
        }

    }
}