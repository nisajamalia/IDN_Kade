package com.nisa.idn_kade

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class FootballItem(
        val name: String,
        val image: Int,
        val description: String) : Parcelable
