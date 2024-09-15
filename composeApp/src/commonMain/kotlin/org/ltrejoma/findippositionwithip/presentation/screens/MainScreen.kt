package org.ltrejoma.findippositionwithip.presentation.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.FabPosition
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldColors
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import findpositionwithip.composeapp.generated.resources.Res
import findpositionwithip.composeapp.generated.resources.baseline_location_searching_24
import findpositionwithip.composeapp.generated.resources.compose_multiplatform
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource
import org.ltrejoma.findippositionwithip.presentation.screens.composables.appButton
import org.ltrejoma.findippositionwithip.presentation.screens.composables.primaryBlue
import org.ltrejoma.findippositionwithip.presentation.screens.composables.text.SubTitleText
import org.ltrejoma.findippositionwithip.presentation.screens.composables.textFields.StandardTextField
import org.ltrejoma.findippositionwithip.presentation.viewModels.MainViewModel

@Composable
fun MainScreen(viewModel: MainViewModel) {

    Scaffold(
        backgroundColor =  primaryBlue,
        floatingActionButtonPosition= FabPosition.Center,
        floatingActionButton = {appButton(action = {viewModel.searchTheIp()}, valueOfButton = "Go and search" )
        }
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.padding(horizontal = 16.dp)
                .fillMaxHeight(1f).fillMaxWidth()) {

            SubTitleText("Search the ip direction")
            Image(painter = painterResource(Res.drawable.baseline_location_searching_24),null)

            StandardTextField(onValueChange ={inputIP-> viewModel.updateUiState(viewModel.uiState.copy(ip = inputIP))}, value = viewModel.uiState.ip )
        }
    }
}



