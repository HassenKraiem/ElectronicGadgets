package com.example.electronicgadgets.MainView

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.electronicgadgets.R
import com.example.electronicgadgets.ui.theme.DataSource
import com.example.electronicgadgets.ui.theme.Electric
import com.example.electronicgadgets.ui.theme.Purple80

@Composable
fun Electric_Icons(
    electric: Electric,
    // Todo: Remove bg color param
    backgroundColor: Color = Purple80,
    isSelected: Boolean = false,
) {
    Column(
        modifier = Modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .width(66.dp)
                .height(62.dp)
                .clip(shape = RoundedCornerShape(10.dp))
                .background(color = backgroundColor)
                .padding(18.dp)
        ) {
            Image(
                painter = painterResource(electric.imageResourceId),
                contentDescription = null,
                contentScale = ContentScale.Inside,
                modifier = Modifier.fillMaxWidth()
            )
        }

        Text(text = electric.description)
    }
}

@Preview
@Composable
fun ElectricIconsPreview() {
    Electric_Icons(
        electric = DataSource().listOfElectricIcons[1],
        isSelected = true
    )
}