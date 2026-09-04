package com.tatanstudios.eltuncazometapan.presentation.viewmodel.character

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.tatanstudios.eltuncazometapan.domain.repository.CharacterRepository
import kotlinx.coroutines.launch
import org.orbitmvi.orbit.OrbitContainerHost
import org.orbitmvi.orbit.orbitContainer

class CharacterViewModel(
    private val characterRepository: CharacterRepository
) : ViewModel(), OrbitContainerHost<CharacterState, CharacterState, CharacterSideEffect> {

    override val container = viewModelScope.orbitContainer<CharacterState, CharacterSideEffect>(
        initialState = CharacterState()
    )

    init {
        getCharacters()
    }

    private fun getCharacters() = intent{
        reduce { state.copy(isLoading = true) }
        val characters = characterRepository.getCharacters(1)
        reduce {
            state.copy(
                isLoading = false,
                characters = characters
            )
        }
    }
}