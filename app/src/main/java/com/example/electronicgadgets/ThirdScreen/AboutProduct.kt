package com.example.electronicgadgets.ThirdScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.electronicgadgets.R
import com.example.electronicgadgets.ui.theme.DataSource
import com.example.electronicgadgets.ui.theme.Electric
import com.example.electronicgadgets.ui.theme.ElectronicGadgetsTheme

@Composable
fun AboutProduct(electric: Electric,modifier: Modifier){
    Column(modifier = Modifier.fillMaxWidth()) {
        Box(modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.5f)
  //          .weight(0.75f)
            .background(color = colorResource(R.color.gris)),
            contentAlignment = Alignment.Center,
            ) {
            Image(
                painter = painterResource(electric.imageResourceId),
                contentScale = ContentScale.Crop,
                contentDescription = null,
                modifier = Modifier.fillMaxSize()
            )
        }
        Box(modifier = Modifier
//            .weight(1f)
        ) {
            Column {
                Text(
                    text = electric.description,
                    fontSize = 24.sp,
                    lineHeight = 27.58.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(top = 15.dp)
                        .padding(horizontal = 15.dp)
                )
                Text(
                    text = electric.price,
                    fontSize = 20.sp,
                    lineHeight = 22.98.sp,
                    modifier = Modifier.padding(horizontal = 15.dp)
                        .padding(bottom = 15.dp)
                )
                Text(
                    text = electric.moreDetailedDescription,
                    textAlign = TextAlign.Center,
                    fontSize = 16.sp,
                    lineHeight = 25.sp,
                    color = Color.Gray,
                    modifier = Modifier.padding(15.dp)
                )
            }
        }
    }

}
@Preview(showBackground = true)
@Composable
fun ScreenPreview() {
    ElectronicGadgetsTheme {
        val electric= DataSource().listOfDetailedHeadset[0]
    }
}
