package com.tatanstudios.eltuncazometapan.di

import com.tatanstudios.eltuncazometapan.data.remote.RickAndMortyApi
import io.ktor.client.HttpClient
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.defaultRequest
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json
import org.koin.dsl.module

val networkModule = module {
    single {
        HttpClient {
            install(plugin = ContentNegotiation) {
                json(
                    Json {
                        ignoreUnknownKeys = true
                        prettyPrint = true
                    }
                )
            }
            defaultRequest {
                url(urlString = "https://rickandmortyapi.com")
            }
        }
    }
    single { RickAndMortyApi(get()) }
}