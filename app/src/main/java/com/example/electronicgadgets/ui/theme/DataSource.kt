package com.example.electronicgadgets.ui.theme

import com.example.electronicgadgets.R

class DataSource {
    val listOfMainElectrics = listOf(
        Electric(
            "Wireless Headsets",
            price = "$109.09",
            imageResourceId = R.drawable.levitating_music_headphones_display
        ),
        Electric(
            "Camera",
            price = "$109.09",
            imageResourceId = R.drawable.levitating_music_headphones_display
        )

    )
    val listOfElectricIcons = listOf(
        Electric(
            description = "All",
            imageResourceId = R.drawable.frame_30
        ),
        Electric(
            description = "Cameras",
            imageResourceId = R.drawable.frame_31
        ),
        Electric(
            description = "Laptops",
            imageResourceId = R.drawable.frame_32
        ),
        Electric(
            description = "Headsets",
            imageResourceId = R.drawable.frame_33
        ),
        Electric(
            description = "Phones",
            imageResourceId = R.drawable.frame_34
        )
    )
    val listOfDetailedHeadset= listOf(Electric(
        description = "Beats Pro",
        price = "$150.03",
        imageResourceId = R.drawable.pngegg___2022_03_14t175957,
        moreDetailedDescription = "Adjustable fit with comfort-cushioned ear cupsFine-tuned acoustics for clarity and depth with noise isolation Up to 40 hours of listening timeApple W1 chip & Class 1 Wireless Bluetooth®",
        Duration = "40 hours litening",
        power = "5m Power up fuel",
        id = "1"

    ),
        Electric(
            description = "Beats Solo 2",
            price = "$90.13",
            imageResourceId = R.drawable.pngegg___2022_03_14t175957,
            id = "2"
        ),
        Electric(
            description = "Beats Solo 2",
            price = "$109.09",
            imageResourceId = R.drawable.pngegg___2022_03_14t175957,
            id = "3"
        ),
        Electric(
            description = "Red Beats",
            price = "$154.33",
            imageResourceId = R.drawable.pngegg___2022_03_14t175957,
            id = "4"
        ),
        Electric(
            description = "cc",
            price = "$50000202",
            imageResourceId = R.drawable.pngegg___2022_03_14t175957,
            id = "5"
        ),
        Electric(
            description = "cc",
            price = "$50000202",
            imageResourceId = R.drawable.pngegg___2022_03_14t175957,
            id = "6"
        ),
        Electric(
            description = "cc",
            price = "$50000202",
            imageResourceId = R.drawable.pngegg___2022_03_14t175957,
            id = "7"
        ),
        Electric(
            description = "cc",
            price = "$50000202",
            imageResourceId = R.drawable.pngegg___2022_03_14t175957,
            id = "8"
        ),
        Electric(
            description = "cc",
            price = "$50000202",
            imageResourceId = R.drawable.pngegg___2022_03_14t175957,
            id = "9"
        )
    )
}
