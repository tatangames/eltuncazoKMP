package com.tatanstudios.eltuncazometapan.di

import com.tatanstudios.eltuncazometapan.presentation.viewmodel.CharacterViewModel
import org.koin.dsl.module
import org.koin.core.module.dsl.viewModel

val viewModelModule = module {
    viewModel { CharacterViewModel(get()) }
}