package com.example.electronicgadgets.MainView

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.electronicgadgets.Navigation.Route
import com.example.electronicgadgets.ui.theme.DataSource
import com.example.electronicgadgets.ui.theme.Electric

@Composable
fun MainView(
    modifier: Modifier,
    onItemClick: (Electric) -> Unit
) {
    val listOfMainElectric = DataSource().listOfMainElectrics
    val listOfIcons = DataSource().listOfElectricIcons

    Column(modifier = modifier.fillMaxWidth()) {
        Text(
            text = "Categories",
            fontSize = 24.sp,
            lineHeight = 40.sp,
            fontWeight = FontWeight(500)
        )

        LazyRow(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(listOfIcons) { item: Electric ->
                Electric_Icons(item)
            }
        }

        LazyColumn {
            items(listOfMainElectric) { item: Electric ->
                ElectricMainBox(
                    electric = item,
                    onClick = {
                        onItemClick(item)
                    }
                )
            }
        }
    }

}