package com.example.electronicgadgets.DetailedScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.electronicgadgets.Navigation.Route
import com.example.electronicgadgets.R
import com.example.electronicgadgets.ui.theme.DataSource
import com.example.electronicgadgets.ui.theme.Electric

@Composable
fun BoxToBuy(electric: Electric, navController: NavController) {
    Box(
        modifier = Modifier
            .padding(15.dp)
            .clip(shape = RoundedCornerShape(10.dp))
            .background(color = colorResource(R.color.gris))
            .height(215.dp)
            .clickable { navController.navigate(
                route =Route.ElectronicFinalBox.route) },
        contentAlignment = Alignment.Center){
        Column(
            verticalArrangement = Arrangement.SpaceEvenly, modifier = Modifier.fillMaxSize()
        ) {
            Image(painter = painterResource(electric.imageResourceId),
                contentDescription = null,
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .fillMaxWidth()
            )
            Column {
                Text(
                    text = electric.description,
                    textAlign = TextAlign.Center,
                    color = Color.Gray,
                    modifier = Modifier.fillMaxWidth()

                )
                Text(
                    text = electric.price,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.fillMaxWidth()
                )
            }
        }
    }
}