package com.example.electronicgadgets.MainView

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.electronicgadgets.Navigation.Route
import com.example.electronicgadgets.ui.theme.DataSource
import com.example.electronicgadgets.ui.theme.Electric

@Composable
fun ElectricMainBox(
    electric: Electric,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .padding(25.dp)
            .clip(shape = RoundedCornerShape(25.dp))
            .background(color = Color.Black)
            .clickable {
                onClick()
            }
    ) {
        Column {
            Image(
                painter = painterResource(electric.imageResourceId),
                contentDescription = null,
                contentScale = ContentScale.Fit
            )

            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.BottomStart
            ) {
                Text(
                    text = "Wireless Headsets",
                    color = Color.White,
                    fontSize = 18.sp,
                    lineHeight = 20.68.sp,
                    modifier = Modifier.padding(15.dp)
                )
            }
        }
    }
}

@Preview
@Composable
fun ElectricItemPreview() {
    ElectricMainBox(
        electric = DataSource().listOfMainElectrics.first(),
        onClick = {

        }
    )
}