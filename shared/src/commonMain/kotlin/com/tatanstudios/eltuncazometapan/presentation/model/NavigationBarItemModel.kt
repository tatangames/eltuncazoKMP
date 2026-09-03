package com.tatanstudios.eltuncazometapan.presentation.model

import androidx.compose.ui.graphics.vector.ImageVector
import com.tatanstudios.eltuncazometapan.presentation.navigation.Screen

data class NavigationBarItemModel(
    val icon: ImageVector,
    val label: String,
    val route: Screen
)