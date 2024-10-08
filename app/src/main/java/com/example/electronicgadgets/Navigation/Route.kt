package com.example.electronicgadgets.Navigation

sealed class Route(val route: String) {
    object ElectricMainBox:Route(route="main")
    object ElectricDetailedBox:Route(route = "Detail")
    object ElectronicFinalBox:Route(route = "Final/{id}")
}