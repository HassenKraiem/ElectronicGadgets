package com.example.electronicgadgets.DetailedScreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.electronicgadgets.ui.theme.DataSource
import com.example.electronicgadgets.ui.theme.Electric

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailedScreen(navController: NavController) {
    val listOfTitles = listOf(
        "new",
        "featured",
        "must see",
        "top selected"
    )
    val listOfHeadset = DataSource().listOfDetailedHeadset
    Scaffold(modifier = Modifier,
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Row(horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier.fillMaxWidth()) {
                        IconButton(onClick = {}) {
                            Icon(
                                imageVector = Icons.Default.ArrowBack,
                                contentDescription = null
                            )
                        }
                        IconButton(onClick = {}) {
                            Icon(
                                imageVector = Icons.Default.ShoppingCart,
                                contentDescription = null
                            )
                        }
                    }

                })
        }) { innerpadding ->
        Column(modifier = Modifier
            .padding(innerpadding)
            .padding(15.dp)) {
            Text(
                text = "Wireless Headsets",
                fontSize = 24.sp,
                lineHeight = 27.58.sp
            )
            LazyRow(Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween) {
                items(listOfTitles) { item: String ->
                    TextEffect(item)
                }
            }

            LazyVerticalGrid(
                columns = GridCells.Fixed(2),
                modifier = Modifier
                    .padding(15.dp)

            ) {
                items(listOfHeadset) { item: Electric ->
                    BoxToBuy(electric = item, navController = navController)

                }
            }
        }


    }


}