package org.ltrejoma.findippositionwithip.presentation.screens.composables.text

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun ButtonText(value : String){
    Text(text = value,
        color = Color(16,37,66),
        fontSize = 14.sp,
        fontWeight = FontWeight.W400)
}
