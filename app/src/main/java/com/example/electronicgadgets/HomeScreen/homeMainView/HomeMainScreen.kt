package com.example.electronicgadgets.HomeScreen.homeMainView

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.SearchBar
import androidx.compose.material3.SearchBarDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.electronicgadgets.ui.theme.DataSource
import com.example.electronicgadgets.ui.theme.Electric
import com.example.electronicgadgets.ui.theme.Gris02

// HomeScreen
// BoxToBuy... -8_

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeMainScreen(
    modifier: Modifier, innerPadding: PaddingValues, onItemClick: (Electric) -> Unit
) {
    val listOfMainElectric = DataSource().listOfMainElectrics
    var listOfMainElectric1 by remember { mutableStateOf(DataSource().listOfElectricIcons) }
    var id2 by remember { mutableStateOf("0") }
    val listOfIcons = DataSource().listOfElectricIcons
    var text by remember { mutableStateOf("") }
    var active by remember { mutableStateOf(false) }
    var isSelected by remember { mutableStateOf(false) }


    if (isSelected == false) {
        listOfMainElectric1 = listOfMainElectric
    } else {
        when (id2) {
            "0" -> listOfMainElectric1 = listOfMainElectric
            "1" -> listOfMainElectric1 = listOfMainElectric.filter { "Cameras" in it.description }
            "2" -> listOfMainElectric1 = listOfMainElectric.filter { "Laptops" in it.description }
            "3" -> listOfMainElectric1 = listOfMainElectric.filter { "Headsets" in it.description }
            "4" -> listOfMainElectric1 = listOfMainElectric.filter { "Phones" in it.description }
        }
    }

    LazyColumn {
        item {
            Column(
                modifier = modifier
                    .fillMaxSize()
                    .padding(15.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Hey, buy the best  Electronic Gadgets",
                    fontSize = 30.sp,
                    lineHeight = 39.sp,
                    fontWeight = FontWeight.Bold,
                    maxLines = 2,
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(top = 100.dp)

                )
                SearchBar(query = text,
                    onQueryChange = { text = it },
                    onSearch = { active = false },
                    active = active,
                    onActiveChange = { active = it },
                    colors = SearchBarDefaults.colors(
                        dividerColor = Color.Black,
                        containerColor = Gris02,
                    ),
                    placeholder = {
                        Text(text = "Search any product")
                    },
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.Search, contentDescription = null
                        )
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .align(alignment = Alignment.CenterHorizontally)
                        .aspectRatio(348 / 56f)
                        .padding(horizontal = 25.dp)

                ) {}
                Spacer(Modifier.height(25.dp))
                //Column(modifier = Modifier.fillMaxWidth()) {
                Text(
                    text = "Categories",
                    textAlign = TextAlign.Start,
                    fontSize = 24.sp,
                    lineHeight = 40.sp,
                    fontWeight = FontWeight(500),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp)
                )

                LazyRow(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    items(listOfIcons) { item: Electric ->
                        Electric_Icons(item, onClick = {
                            id2 = item.id
                            isSelected = !isSelected
                        })
                    }
                }
                //}
            }
        }
        items(listOfMainElectric1) { item: Electric ->
            ElectricMainBox(electric = item, onClick = {
                onItemClick(item)
            })
        }
    }
}

@Preview
@Composable
fun ElectricItemsPreview() {

}



