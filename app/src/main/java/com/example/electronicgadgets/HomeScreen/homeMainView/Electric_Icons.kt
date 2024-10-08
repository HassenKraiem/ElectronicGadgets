package com.example.electronicgadgets.HomeScreen.homeMainView

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.electronicgadgets.ui.theme.Black01
import com.example.electronicgadgets.ui.theme.DataSource
import com.example.electronicgadgets.ui.theme.Electric
import com.example.electronicgadgets.ui.theme.Gris02
import com.example.electronicgadgets.ui.theme.Gris03

@Composable
fun Electric_Icons(
    electric: Electric, onClick: () -> Unit
) {
    var isSelected by remember { mutableStateOf(false) }
    var backgroundColor by remember { mutableStateOf(Gris02) }
    var color by remember { mutableStateOf(Gris03) }
    Column(
        modifier = Modifier, horizontalAlignment = Alignment.CenterHorizontally
    ) {
        if (isSelected) {
            backgroundColor = Color.Black
            color = Color.Black
        } else {
            backgroundColor = Gris02
            color = Gris03
        }
        if (electric.description=="All")backgroundColor= Black01
        Box(contentAlignment = Alignment.Center,
            modifier = Modifier
                .width(66.dp)
                .height(62.dp)
                .clip(shape = RoundedCornerShape(10.dp))
                .background(color = backgroundColor)
                .padding(18.dp)
                .clickable {
                    isSelected = !isSelected
                    onClick()
                }

        ) {
            Image(
                painter = painterResource(electric.imageResourceId),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )
        }

        Text(
            text = electric.description, color = color
        )
    }
}

@Preview
@Composable
fun ElectricIconsPreview() {
    Electric_Icons(electric = DataSource().listOfElectricIcons[1], onClick = {}

    )
}