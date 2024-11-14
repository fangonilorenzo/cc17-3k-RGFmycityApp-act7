package com.example.explorebaguiocity

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Place(
    val name: String,
    val imageResource: Int,
    val category: String,
    val details: String,
    val location: String
) : Parcelable

