package com.tatanstudios.eltuncazometapan.data.repository

import com.tatanstudios.eltuncazometapan.data.mapper.toCharacter
import com.tatanstudios.eltuncazometapan.data.remote.RickAndMortyApi
import com.tatanstudios.eltuncazometapan.domain.model.Character
import com.tatanstudios.eltuncazometapan.domain.repository.CharacterRepository

class CharacterRepositoryImpl(
    private val api: RickAndMortyApi,
): CharacterRepository {
    override suspend fun getCharacters(page: Int): List<Character> =
        api.getCharacters(page).results.map { it.toCharacter() }
}