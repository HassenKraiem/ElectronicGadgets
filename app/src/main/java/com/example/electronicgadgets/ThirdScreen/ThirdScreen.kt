package com.example.electronicgadgets.ThirdScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.electronicgadgets.Navigation.Route
import com.example.electronicgadgets.R
import com.example.electronicgadgets.ui.theme.Electric

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ThirdScreen(
    electric: Electric, modifier: Modifier = Modifier, navController: NavController
) {
    Column(modifier = modifier.fillMaxSize()) {
        Scaffold(modifier = Modifier, topBar = {
            CenterAlignedTopAppBar(colors = TopAppBarDefaults.topAppBarColors(
                containerColor = colorResource(
                    R.color.gris
                )
            ), title = {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Icon(imageVector = Icons.Default.ArrowBack,
                        contentDescription = null,
                        modifier = Modifier.clickable {
                            navController.navigate(route = Route.ElectricDetailedBox.route) })
                    Text(text = "About Product")
                    Icon(
                        imageVector = Icons.Default.ShoppingCart, contentDescription = null
                    )
                }
            })
        }) { innerpadding ->
            Column(
                Modifier
                    .fillMaxSize()
                    .padding(innerpadding)
                    .verticalScroll(state = rememberScrollState())
            ) {
                AboutProduct(electric = electric, modifier = Modifier)
                DownThirdScreen(electric = electric, modifier = Modifier.padding(20.dp))
                //  Spacer(Modifier.height(10.dp))
                Button(
                    onClick = {},
                    Modifier
                        .fillMaxWidth()
                        .height(60.dp)
                        .padding(horizontal = 15.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = colorResource(R.color.assouad))
                ) {
                    Text(
                        text = "Add to cart", fontSize = 18.sp
                    )
                }
            }
        }
    }


}