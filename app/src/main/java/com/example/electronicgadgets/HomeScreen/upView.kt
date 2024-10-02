package com.example.electronicgadgets.HomeScreen


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.electronicgadgets.MainView.MainView
import com.example.electronicgadgets.ui.theme.Electric

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun View(
    modifier: Modifier = Modifier,
    onItemClick: (Electric) -> Unit,
) {
    var text by remember { mutableStateOf("") }
    var active by remember { mutableStateOf(false) }
    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Hey, buy the best  Electronic Gadgets",
            fontSize = 30.sp,
            lineHeight = 39.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(horizontal = 25.dp)
                .padding(top = 25.dp)
        )
//        Scaffold(
//            modifier = Modifier.align(alignment = Alignment.CenterHorizontally),
//
//            ) { innerPadding ->
//            Column {
                SearchBar(
                    query = text,
                    onQueryChange = { text = it },
                    onSearch = { active = false },
                    active = active,
                    onActiveChange = { active = it },
                    colors = SearchBarDefaults.colors(
                        dividerColor = Color.Black,
                    ),
                    placeholder = {
                        Text(text = "Search any product")
                    },
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.Search,
                            contentDescription = null
                        )
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .align(alignment = Alignment.CenterHorizontally)
                        .padding(horizontal = 25.dp)
                )
                {}

                MainView(
                    modifier = Modifier,
                    onItemClick = onItemClick,
                )
//            }

//        }
    }
}