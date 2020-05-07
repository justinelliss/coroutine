package com.launchpad.coroutine.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Todo(
    val userId: Int,
    val id: Int,
    val title: String,
    val completed: Boolean) : Parcelable