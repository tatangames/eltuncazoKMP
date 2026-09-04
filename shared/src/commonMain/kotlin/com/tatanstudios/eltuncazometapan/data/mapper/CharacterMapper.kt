package com.tatanstudios.eltuncazometapan.data.mapper

import com.tatanstudios.eltuncazometapan.data.model.CharacterResponse
import com.tatanstudios.eltuncazometapan.domain.model.Character

fun CharacterResponse.CharacterData.toCharacter(): Character{
    return Character(
        id = id,
        name = name,
        status = status,
        species = species,
        type = type,
        gender = gender,
        location = location.name,
        image = image
    )
}