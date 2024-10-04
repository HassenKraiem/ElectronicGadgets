package com.example.electronicgadgets.DetailedScreen

import androidx.compose.foundation.clickable
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import com.example.electronicgadgets.ui.theme.Black01
import com.example.electronicgadgets.ui.theme.Gris03

@Composable
fun TextEffect(string: String){
    var isSelected by remember { mutableStateOf(false) }
    var color by remember { mutableStateOf(Gris03) }
    var textDecoration by remember { mutableStateOf(TextDecoration.None) }
    var fontWeight by remember { mutableStateOf(FontWeight(400)) }
    if (isSelected){
        color= Black01
        textDecoration=TextDecoration.Underline
        fontWeight=FontWeight.Bold
    }
    else{
        color= Gris03
        textDecoration=TextDecoration.None
        fontWeight=FontWeight(400)
    }

    Text(
        text = string,
        color = color,
        textDecoration = textDecoration,
        fontWeight = fontWeight,
            modifier = Modifier
                .clickable { isSelected = !isSelected }
    )

}