package com.tatanstudios.eltuncazometapan.domain.repository

import com.tatanstudios.eltuncazometapan.domain.model.Character
import com.tatanstudios.eltuncazometapan.domain.model.Location

interface LocationRepository {
    suspend fun getLocation(page: Int): List<Location>
}