package com.tatanstudios.eltuncazometapan.presentation.viewmodel.location

import com.tatanstudios.eltuncazometapan.domain.model.Location

data class LocationState(
    val isLoading: Boolean = false,
    val locations: List<Location> = emptyList(),
)