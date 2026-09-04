package com.tatanstudios.eltuncazometapan

import androidx.compose.ui.window.ComposeUIViewController
import com.tatanstudios.eltuncazometapan.di.initKoin
import com.tatanstudios.eltuncazometapan.presentation.App

fun MainViewController() = ComposeUIViewController(
    configure = {
        initKoin{}
    }
) { App() }