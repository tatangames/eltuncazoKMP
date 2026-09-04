package com.tatanstudios.eltuncazometapan.presentation.screen.location.preview

import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import com.tatanstudios.eltuncazometapan.domain.model.Character
import com.tatanstudios.eltuncazometapan.domain.model.Location
import com.tatanstudios.eltuncazometapan.presentation.viewmodel.character.CharacterState
import com.tatanstudios.eltuncazometapan.presentation.viewmodel.location.LocationState

class LocationStateParameterProvider : PreviewParameterProvider<LocationState> {

    override val values: Sequence<LocationState> = sequenceOf(
        LocationState(
            isLoading = true,
            locations = emptyList()
        ),
        LocationState(
            isLoading = false,
            locations = listOf(
                Location(
                    id = 1,
                    name = "Planeta tierra",
                    type = "tierra",
                    dimension = "Dimension C-137"
                ),
                Location(
                    id = 2,
                    name = "Abadango",
                    type = "Cluster",
                    dimension = "Desconocida"
                ),
            )
        )
    )

}