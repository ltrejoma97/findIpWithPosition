package org.ltrejoma.findippositionwithip.di

import org.koin.dsl.module
import org.ltrejoma.findippositionwithip.presentation.viewModels.MainViewModel


val viewModelModule = module {
    single <MainViewModel> {MainViewModel()  }
}