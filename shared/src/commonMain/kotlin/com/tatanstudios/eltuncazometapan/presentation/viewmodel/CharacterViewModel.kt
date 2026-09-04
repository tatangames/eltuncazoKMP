package com.tatanstudios.eltuncazometapan.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.tatanstudios.eltuncazometapan.domain.repository.CharacterRepository
import kotlinx.coroutines.launch

class CharacterViewModel(
    private val characterRepository: CharacterRepository
) : ViewModel(){
    init {
        getCharacter()
    }

    private fun getCharacter() {
        viewModelScope.launch {
            val characters = characterRepository.getCharacters(1)
            println(characters)
        }
    }
}