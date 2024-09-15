package org.ltrejoma.findippositionwithip.presentation.viewModels

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue


class MainViewModel {

    var uiState : MainScreenUiState by mutableStateOf(MainScreenUiState())

    fun updateUiState(updatedUiState:MainScreenUiState){
       this.uiState= updatedUiState
    }

    fun searchTheIp(){
        println("searching")
    }
}

data class MainScreenUiState(
    val thereIsAnIPSearched : Boolean =false,
    val ip: String = "",
)