package com.tatanstudios.eltuncazometapan.presentation.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.tatanstudios.eltuncazometapan.presentation.viewmodel.CharacterViewModel
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun CharacterScreen() {

    val viewModel = koinViewModel<CharacterViewModel>()

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Characters Screen")
    }
}