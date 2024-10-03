package com.example.electronicgadgets.DetailedScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.electronicgadgets.ui.theme.Black01
import com.example.electronicgadgets.ui.theme.Electric
import com.example.electronicgadgets.ui.theme.Gris02

@Composable
fun BoxToBuy(electric: Electric, navController: NavController) {
    Box(
        modifier = Modifier
            .padding(15.dp)
            .clip(shape = RoundedCornerShape(10.dp))
            .background(color = Gris02)
            .aspectRatio(164f / 244f)
            .clickable {
                navController.navigate(
                    route = "Final/" + electric.id,
                )
            }, contentAlignment = Alignment.Center
    ) {
        Column(
            verticalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier
                .fillMaxSize()
        ) {
            Image(
                painter = painterResource(electric.imageResourceId),
                contentDescription = null,
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(2f)
                    .padding(5.dp)
            )
            Column(
                Modifier.weight(1f), verticalArrangement = Arrangement.Bottom
            ) {
                Text(
                    text = electric.description,
                    textAlign = TextAlign.Center,
                    color = Black01,
                    fontSize = 16.sp,
                    fontWeight = FontWeight(400),
                    lineHeight = 18.38.sp,
                    modifier = Modifier
                        .fillMaxWidth()
                        .alpha(0.5f)

                )
                Text(
                    text = electric.price,
                    textAlign = TextAlign.Center,
                    fontSize = 16.sp,
                    lineHeight = 18.38.sp,
                    color = Black01,
                    fontWeight = FontWeight(500),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 5.dp, bottom = 10.dp)

                )
            }
        }
    }
}