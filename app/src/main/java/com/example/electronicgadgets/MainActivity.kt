package com.example.electronicgadgets

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.rememberNavController
import com.example.electronicgadgets.Navigation.AllNavigation
import com.example.electronicgadgets.ui.theme.DataSource
import com.example.electronicgadgets.ui.theme.ElectronicGadgetsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ElectronicGadgetsTheme {
                val navController = rememberNavController()

                AllNavigation(
                    navController,
                    electric = DataSource().listOfDetailedHeadset[0]
                )
            }
        }
    }
}

