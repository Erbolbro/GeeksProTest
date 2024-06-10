package com.skala.flower.ui.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class CarModel(
    val image:String,
    val name:String,
    val year:String,
):Parcelable