package com.tatanstudios.eltuncazometapan.data.repository

import com.tatanstudios.eltuncazometapan.data.mapper.toLocation
import com.tatanstudios.eltuncazometapan.data.remote.RickAndMortyApi
import com.tatanstudios.eltuncazometapan.domain.model.Location
import com.tatanstudios.eltuncazometapan.domain.repository.LocationRepository

class LocationRepositoryImpl(
    private val api: RickAndMortyApi,
): LocationRepository {
    override suspend fun getLocation(page: Int): List<Location> =
        return api.getLocation(page).results.map { it.toLocation() }
}