package com.tatanstudios.eltuncazometapan.data.mapper

import com.tatanstudios.eltuncazometapan.data.model.LocationResponse
import com.tatanstudios.eltuncazometapan.domain.model.Location

fun LocationResponse.LocationData.toLocation(): Location{
    return Location(
        id = id,
        name = name,
        type = type,
        dimension = dimension
    )
}