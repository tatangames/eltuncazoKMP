package com.tatanstudios.eltuncazometapan.di

import com.tatanstudios.eltuncazometapan.data.remote.RickAndMortyApi
import com.tatanstudios.eltuncazometapan.data.repository.CharacterRepositoryImpl
import com.tatanstudios.eltuncazometapan.data.repository.LocationRepositoryImpl
import com.tatanstudios.eltuncazometapan.domain.repository.CharacterRepository
import com.tatanstudios.eltuncazometapan.domain.repository.LocationRepository
import io.ktor.client.HttpClient
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.defaultRequest
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json
import org.koin.dsl.module

val repositoryModule = module {
    single<CharacterRepository> {
        CharacterRepositoryImpl(get())
    }
    single<LocationRepository> {
        LocationRepositoryImpl(get())
    }
}