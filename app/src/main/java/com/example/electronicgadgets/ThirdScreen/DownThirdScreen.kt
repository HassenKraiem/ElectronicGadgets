package com.example.electronicgadgets.ThirdScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.electronicgadgets.R
import com.example.electronicgadgets.ui.theme.Electric

@Composable
fun DownThirdScreen(electric: Electric,modifier: Modifier=Modifier){
    Row(modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceAround) {
        Column(modifier = Modifier.weight(1f),
            horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painter = painterResource(R.drawable._3),
                contentDescription = null,
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .width(34.dp)
                    .height(43.dp)
            )
            Text(text = electric.Duration,
                textAlign = TextAlign.Center,
                fontSize = 14.sp,
                lineHeight = 16.09.sp,
                color = colorResource(R.color.gris2))
        }
        Column(modifier = Modifier.weight(1f),
            horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painter = painterResource(R.drawable._4),
                contentDescription = null,
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .width(34.dp)
                    .height(43.dp)
            )
            Text(text = electric.power,
                textAlign = TextAlign.Center,
                fontSize = 14.sp,
                lineHeight = 16.09.sp,
                color = colorResource(R.color.gris2))
        }
        Column(modifier = Modifier.weight(1f),
            horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painter = painterResource(R.drawable._4_1),
                contentDescription = null,
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .width(34.dp)
                    .height(43.dp)
            )
            Text(text = "Call control",
                textAlign = TextAlign.Center,
                fontSize = 14.sp,
                lineHeight = 16.09.sp,
                color = colorResource(R.color.gris2)
            )
        }
    }


}