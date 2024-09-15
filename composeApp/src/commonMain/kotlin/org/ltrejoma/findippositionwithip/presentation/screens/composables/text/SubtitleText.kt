package org.ltrejoma.findippositionwithip.presentation.screens.composables.text

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun SubTitleText(text :String){
    Text(text = text,
        color = Color(205,215,214),
        fontSize = 22.sp,
        fontWeight = FontWeight.W600)
}
