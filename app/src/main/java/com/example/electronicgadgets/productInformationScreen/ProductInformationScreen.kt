package com.example.electronicgadgets.productInformationScreen

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.electronicgadgets.Navigation.Route
import com.example.electronicgadgets.ui.theme.Black01
import com.example.electronicgadgets.ui.theme.Electric
import com.example.electronicgadgets.ui.theme.Gris02

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProductInformationScreen(
    electric: Electric, modifier: Modifier = Modifier, navController: NavController
) {
    Column(modifier = modifier.fillMaxSize()) {
        Scaffold(modifier = Modifier,
            topBar = {
            CenterAlignedTopAppBar(colors = TopAppBarDefaults.topAppBarColors(
                containerColor = Gris02
            ), title = {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Icon(imageVector = Icons.Default.ArrowBack,
                        contentDescription = null,
                        modifier = Modifier.clickable {
                            navController.navigate(Route.ElectricMainBox.route)
                        })
                    Text(text = "About Product")
                    Icon(
                        imageVector = Icons.Default.ShoppingCart,
                        contentDescription = null
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
                AboutProduct(electric = electric)
                DownThirdScreen(electric = electric,
                    modifier = Modifier.padding(20.dp)
                )
                //  Spacer(Modifier.height(10.dp))
                Button(
                    onClick = {},
                    modifier = Modifier
                        .aspectRatio(348 / 55f)
                        .padding(horizontal = 15.dp)
                        .clip(shape = RoundedCornerShape(5.dp)),
                    colors = ButtonDefaults.buttonColors(containerColor = Black01)
                ) {
                    Text(
                        text = "Add to cart",
                        fontSize = 18.sp
                    )
                }
            }
        }
    }


}