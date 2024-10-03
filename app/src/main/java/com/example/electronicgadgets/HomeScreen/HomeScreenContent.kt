package com.example.electronicgadgets.HomeScreen


import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.electronicgadgets.HomeScreen.homeMainView.HomeMainScreen
import com.example.electronicgadgets.ui.theme.Electric

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreenContent(
    modifier: Modifier = Modifier,
    onItemClick: (Electric) -> Unit,
    innerPadding: PaddingValues
) {
    HomeMainScreen(
        modifier = Modifier,
        innerPadding = innerPadding,
        onItemClick = onItemClick,
    )
}
