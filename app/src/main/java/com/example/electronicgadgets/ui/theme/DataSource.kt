package com.example.electronicgadgets.ui.theme

import com.example.electronicgadgets.R

class DataSource {
    val listOfMainElectrics = listOf(
        Electric(
            "Wireless Headsets", price = "$109.09", imageResourceId = R.drawable.main_headset1,
            id = "0"
        ), Electric(
            "Sky Laptops", price = "$109.09", imageResourceId = R.drawable.main_laptop,
            id = "2"

        ), Electric(
            "Expensive Cameras", price = "$1099.99", imageResourceId = R.drawable.main_camera,
            id = "1"

        ), Electric(
            "Android Phones", price = "$100.99", imageResourceId = R.drawable.main_phone,
            id = "3"

        )

    )
    val listOfElectricIcons = listOf(

        Electric(
            description = "All", imageResourceId = R.drawable.all_typs, id = "0"
        ), Electric(
            description = "Camera", imageResourceId = R.drawable.camera_icon, id = "1"
        ), Electric(
            description = "Laptop", imageResourceId = R.drawable.laptop_icon, id = "2"
        ), Electric(
            description = "Headsets", imageResourceId = R.drawable.headphones_icon, id = "3"
        ), Electric(
            description = "Phones",
            imageResourceId = R.drawable.phone_call_pause_svgrepo_com,
            id = "4"
        )
    )
    val listOfHeadset = listOf(
        Electric(
            description = "Beats Pro",
            price = "$150.03",
            imageResourceId = R.drawable.pink_headset,
            Duration = "40 hours litening",
            power = "5m Power up fuel",
            id = "1"

        ), Electric(
            description = "Beats Solo 2",
            price = "$90.13",
            imageResourceId = R.drawable.light_blue_headset,
            id = "2"
        ), Electric(
            description = "Beats Solo 2",
            price = "$109.09",
            imageResourceId = R.drawable.black_headset_1,
            id = "3"
        ), Electric(
            description = "Red Beats",
            price = "$154.33",
            imageResourceId = R.drawable.red_headset,
            id = "4"
        ), Electric(
            description = "Red Beats",
            price = "$154.33",
            imageResourceId = R.drawable.blue_headset,
            id = "5"
        ), Electric(
            description = "Beats Pro",
            price = "$150.03",
            imageResourceId = R.drawable.black_headset_2,
            id = "6"
        ), Electric(
            description = "Beats Pro",
            price = "$50000202",
            imageResourceId = R.drawable.pink_headset,
            id = "7"
        ), Electric(
            description = "Red Beats",
            price = "$50000202",
            imageResourceId = R.drawable.light_blue_headset,
            id = "8"
        ), Electric(
            description = "Beats Solo 2",
            price = "$50000202",
            imageResourceId = R.drawable.black_headset_1,
            id = "9"
        )
    )


    val listOfCamera = listOf(
        Electric(
            description = "Beats Pro",
            price = "$150.03",
            imageResourceId = R.drawable.pink_camera,
            moreDetailedDescriptionId = R.string.hedset_description1,
            Duration = "40 hours litening",
            power = "5m Power up fuel",
            id = "10"

        ), Electric(
            description = "Beats Solo 2",
            price = "$90.13",
            imageResourceId = R.drawable.blue_camera,
            id = "11"
        ), Electric(
            description = "Beats Solo 2",
            price = "$109.09",
            imageResourceId = R.drawable.gray_camera,
            id = "12"
        ), Electric(
            description = "Red Beats",
            price = "$154.33",
            imageResourceId = R.drawable.green_camera,
            id = "13"
        ), Electric(
            description = "Red Beats",
            price = "$154.33",
            imageResourceId = R.drawable.white_camera,
            id = "14"
        ), Electric(
            description = "Beats Pro",
            price = "$150.03",
            imageResourceId = R.drawable.purple_camera,
            id = "15"
        )
    )
    val listOfLaptop = listOf(
        Electric(
            description = "Beats Pro",
            price = "$150.03",
            imageResourceId = R.drawable.laptop_1,
            moreDetailedDescriptionId = R.string.hedset_description1,
            Duration = "40 hours litening",
            power = "5m Power up fuel",
            id = "16"

        ), Electric(
            description = "Beats Solo 2",
            price = "$90.13",
            imageResourceId = R.drawable.laptop_2,
            id = "17"
        ), Electric(
            description = "Beats Solo 2",
            price = "$109.09",
            imageResourceId = R.drawable.laptop_3,
            id = "18"
        ), Electric(
            description = "Red Beats",
            price = "$154.33",
            imageResourceId = R.drawable.laptop_4,
            id = "19"
        ), Electric(
            description = "Red Beats",
            price = "$154.33",
            imageResourceId = R.drawable.laptop_5,
            id = "20"
        ), Electric(
            description = "Beats Pro",
            price = "$150.03",
            imageResourceId = R.drawable.laptop_6,
            id = "21"
        )
    )
    val listOfPhone = listOf(
        Electric(
            description = "Beats Pro",
            price = "$150.03",
            imageResourceId = R.drawable.phone_1,
            moreDetailedDescriptionId = R.string.hedset_description1,
            Duration = "40 hours litening",
            power = "5m Power up fuel",
            id = "22"

        ), Electric(
            description = "Beats Solo 2",
            price = "$90.13",
            imageResourceId = R.drawable.phone_2,
            id = "23"
        ), Electric(
            description = "Beats Solo 2",
            price = "$109.09",
            imageResourceId = R.drawable.phone_3,
            id = "24"
        ), Electric(
            description = "Red Beats",
            price = "$154.33",
            imageResourceId = R.drawable.phone_4,
            id ="25"
        ), Electric(
            description = "Red Beats",
            price = "$154.33",
            imageResourceId = R.drawable.phone_5,
            id = "26"
        )
    )
    val listOfProducts = listOf(
        Products(listOfHeadset, id = "0"),
        Products(listOfCamera, id = "1"),
        Products(listOfLaptop, id = "2"),
        Products(listOfPhone, id = "3")
    )
    val listOfaAllElements= listOfHeadset+listOfCamera+listOfLaptop+listOfPhone
}




