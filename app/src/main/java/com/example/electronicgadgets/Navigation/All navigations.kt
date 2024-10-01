package com.example.electronicgadgets.Navigation

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.electronicgadgets.DetailedScreen.DetailedScreen
import com.example.electronicgadgets.HomeScreen.HomeScreen
import com.example.electronicgadgets.ThirdScreen.ThirdScreen
import com.example.electronicgadgets.ui.theme.DataSource
import com.example.electronicgadgets.ui.theme.Electric

@Composable
fun AllNavigation(
    navController: NavHostController, electric: Electric
) {

    NavHost(
        navController = navController, startDestination = Route.ElectricMainBox.route
    ) {
        composable(
            route = Route.ElectricMainBox.route,
        ) {
            HomeScreen(navController)
        }
        composable(Route.ElectricDetailedBox.route
        )
        {
            DetailedScreen(navController = navController)

        }
        composable(route = Route.ElectronicFinalBox.route,arguments = listOf(navArgument(name = "id") {
            type = NavType.StringType
        }
        )) {
            val arg=it.arguments?.getString("id").toString()
            Log.d("arg", it.arguments?.getString("id").toString())
            val electric1=DataSource().listOfDetailedHeadset.findLast { it.id==arg }
            ThirdScreen(electric1?:electric, navController = navController)
        }

    }

}