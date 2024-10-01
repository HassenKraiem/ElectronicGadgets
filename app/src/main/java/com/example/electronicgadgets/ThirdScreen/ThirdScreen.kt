package com.example.electronicgadgets.ThirdScreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.electronicgadgets.ui.theme.Electric

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ThirdScreen(electric: Electric,modifier: Modifier=Modifier){
    Column(modifier=modifier.fillMaxSize()) {
        Scaffold(modifier = Modifier,
            topBar = {
                CenterAlignedTopAppBar(
                    title = {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Icon(
                                imageVector = Icons.Default.ArrowBack,
                                contentDescription = null
                            )
                            Text(text = "About Product")
                            Icon(
                                imageVector = Icons.Default.ShoppingCart,
                                contentDescription = null
                            )
                        }
                    }
                )
            }
        ) { innerpadding ->
            Column(Modifier.fillMaxSize().padding(innerpadding)) {
                    AboutProduct(electric = electric, modifier = Modifier)
                    DownThirdScreen(electric = electric, modifier = Modifier.padding(innerpadding))
                    Button(
                        onClick = {},
                        Modifier.fillMaxWidth().padding(innerpadding)
                    ) { Text(text = "Add to cart") }
            }
        }
    }


}