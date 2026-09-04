package com.tatanstudios.eltuncazometapan.presentation.screen.character.preview

import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import com.tatanstudios.eltuncazometapan.domain.model.Character
import com.tatanstudios.eltuncazometapan.presentation.viewmodel.character.CharacterState

class CharacterStateParameterProvider : PreviewParameterProvider<CharacterState> {

    override val values: Sequence<CharacterState> = sequenceOf(
        CharacterState(
            isLoading = true,
            characters = emptyList()
        ),
        CharacterState(
            isLoading = false,
            characters = listOf(
                Character(
                    id = 1,
                    name = "Rick Sanzhez",
                    status = "Alive",
                    species = "Humano",
                    type = "",
                    gender = "Male",
                    location = "Earth",
                    image = ""
                ),
                Character(
                    id = 2,
                    name = "Morty Sanzhez",
                    status = "Alive",
                    species = "Humano",
                    type = "",
                    gender = "Male",
                    location = "Earth",
                    image = ""
                ),
            )
        )
    )

}