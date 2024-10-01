package com.example.electronicgadgets.MainView

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.electronicgadgets.R
import com.example.electronicgadgets.ui.theme.Electric

@Composable
fun Electric_Icons(electric: Electric,
                   backgroundColor: Int = R.color.gris){
    Column(modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Box(
            modifier = Modifier
                .clip(shape = RoundedCornerShape(5.dp))
                .background(color = colorResource(backgroundColor))
                .fillMaxWidth()

        ) {
            Image(
                painter = painterResource(electric.imageResourceId),
                contentDescription = null,
                contentScale = ContentScale.Fit,
            )
        }
        Text(text = electric.description)
    }
}