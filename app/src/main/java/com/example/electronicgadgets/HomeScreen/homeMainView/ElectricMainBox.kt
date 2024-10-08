package com.example.electronicgadgets.HomeScreen.homeMainView

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.electronicgadgets.ui.theme.DataSource
import com.example.electronicgadgets.ui.theme.Electric

@Composable
fun ElectricMainBox(
    electric: Electric, onClick: () -> Unit, modifier: Modifier = Modifier
) {
    Box(modifier = modifier
        .aspectRatio(348 / 248f)
        .padding(15.dp)
        .clip(shape = RoundedCornerShape(50.dp))
        .background(color = Color.Black)
        .clickable {
            onClick()
        }) {
        Image(
            painter = painterResource(electric.imageResourceId),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier.fillMaxSize()/*.blur(20.dp,
                edgeTreatment = BlurredEdgeTreatment(shape = RectangleShape)
            )*/
        )/*GlideImage(
            modifier= Modifier
                .padding(2.dp)
                .width(64.dp)
                .height(64.dp)
                .clip(RoundedCornerShape(8.dp)),
            imageModel = {electric.imageResourceId },
            component = rememberImageComponent {
                +BlurTransformationPlugin(radius = 10) // between 0 to Int.MAX_VALUE.
            }
        )*/


        Box(
            modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.BottomStart
        ) {
            Box(
                modifier = Modifier
                    .fillMaxHeight(0.22f)
                    .fillMaxWidth()


            ) {
                Image(
                    painter = painterResource(electric.imageResourceId),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .blur(20.dp)
                        .fillMaxWidth()
                )
            }
            Text(
                text = electric.description,
                color = Color.White,
                fontSize = 18.sp,
                lineHeight = 20.68.sp,
                modifier = Modifier.padding(15.dp)
            )
        }
    }
}

@Preview
@Composable
fun ElectricItemPreview() {
    ElectricMainBox(electric = DataSource().listOfMainElectrics.first(), onClick = {

    })
}