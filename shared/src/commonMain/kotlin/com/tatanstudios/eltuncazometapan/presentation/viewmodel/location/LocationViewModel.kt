package com.tatanstudios.eltuncazometapan.presentation.viewmodel.location

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.tatanstudios.eltuncazometapan.domain.repository.LocationRepository

import kotlinx.coroutines.launch
import org.orbitmvi.orbit.OrbitContainerHost
import org.orbitmvi.orbit.orbitContainer

class LocationViewModel(
    private val locationRepository: LocationRepository
) : ViewModel(), OrbitContainerHost<LocationState, LocationState, LocationSideEffect> {

    override val container = viewModelScope.orbitContainer<LocationState, LocationSideEffect>(
        initialState = LocationState()
    )

    init {
        getLocations()
    }

    private fun getLocations() = intent{
        reduce { state.copy(isLoading = true) }
        val locations = locationRepository.getLocation(1)
        reduce {
            state.copy(
                isLoading = false,
                locations = locations
            )
        }
    }
}