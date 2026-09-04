package com.tatanstudios.eltuncazometapan.data.remote

import com.tatanstudios.eltuncazometapan.data.model.CharacterResponse
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.client.request.parameter
import io.ktor.http.parameters

class RickAndMortyApi(
    private val httpClient: HttpClient
) {

    suspend fun getCharacters(page: Int): CharacterResponse{
        return httpClient.get("/api/character"){
            parameter("page", page)
        }.body()
    }
}