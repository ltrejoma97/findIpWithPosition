package org.ltrejoma.findippositionwithip.presentation.screens.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import org.ltrejoma.findippositionwithip.presentation.screens.composables.text.ButtonText

@Composable
fun appButton(action  :()->Unit, valueOfButton: String)
{
    Button(colors = ButtonDefaults.buttonColors(backgroundColor =
    Color(248,112,96)),
        onClick = {action.invoke()},
        modifier = Modifier.fillMaxWidth(1f).padding(horizontal = 16.dp)
            .background(Color(248,112,96)),
        content = {
            ButtonText(valueOfButton)
        })

}