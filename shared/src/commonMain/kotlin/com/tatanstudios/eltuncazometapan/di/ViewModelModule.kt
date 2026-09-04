package com.tatanstudios.eltuncazometapan.di

import com.tatanstudios.eltuncazometapan.presentation.viewmodel.character.CharacterViewModel
import com.tatanstudios.eltuncazometapan.presentation.viewmodel.location.LocationViewModel
import org.koin.dsl.module
import org.koin.core.module.dsl.viewModel

val viewModelModule = module {
    viewModel { CharacterViewModel(get()) }
    viewModel { LocationViewModel(get()) }
}