package com.example.electronicgadgets.HomeScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.electronicgadgets.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    navController: NavController
) {
    Scaffold(modifier = Modifier.padding(horizontal = 25.dp), topBar = {
        CenterAlignedTopAppBar(title = {
            Row(
                modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Image(
                    painter = painterResource(R.drawable.ellipse_1),
                    contentDescription = null,
                    contentScale = ContentScale.Fit,
                    modifier = Modifier.size(45.dp)
                )
                Image(
                    painter = painterResource(R.drawable.top_bar_icon),
                    contentDescription = null,
                    contentScale = ContentScale.Fit

                )
            }
        })
    }) { innerPadding ->
        HomeScreenContent(innerPadding = innerPadding,
            modifier = Modifier.padding(innerPadding),
            onItemClick = { item ->
                /*val route =
                    when {
                        "Headsets" in item.description ->
                            Route.ElectricDetailedBox.route

                        "Camera" in item.description ->
                            Route.ElectricMainBox.route

                        else ->
                            ""
                    }*/

                navController.navigate(route = "Detail/" + item.id)
            })
    }
}