package com.tatanstudios.eltuncazometapan.domain.repository

import com.tatanstudios.eltuncazometapan.domain.model.Character

interface CharacterRepository {
    suspend fun getCharacters(page: Int): List<Character>
}