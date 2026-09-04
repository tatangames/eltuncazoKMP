package com.tatanstudios.eltuncazometapan.presentation.viewmodel.character

import com.tatanstudios.eltuncazometapan.domain.model.Character

data class CharacterState(
    val isLoading: Boolean = false,
    val characters: List<Character> = emptyList(),
)