package org.ltrejoma.findippositionwithip.presentation.screens.composables.textFields

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import org.ltrejoma.findippositionwithip.presentation.screens.composables.primaryBlue
import org.ltrejoma.findippositionwithip.presentation.screens.composables.secondaryColor

@Composable
fun StandardTextField(onValueChange : (String)-> Unit,value : String){
    TextField(
        modifier = Modifier.fillMaxWidth(1f).padding(bottom = 8.dp),
        value = value,
        colors = TextFieldDefaults.textFieldColors(
            focusedIndicatorColor = Color.Transparent,
            cursorColor = primaryBlue,
            unfocusedLabelColor = primaryBlue,
            leadingIconColor = primaryBlue,
            textColor = primaryBlue,
            backgroundColor = secondaryColor),

        onValueChange = {newValue : String-> onValueChange(newValue)})
}
