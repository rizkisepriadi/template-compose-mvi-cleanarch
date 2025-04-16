package com.app.template_compose_mvi_cleanarch.data.source.local.entity

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity(tableName = "test")
data class Entity(
    @PrimaryKey
    val id: Int = 0,
    val name: String
) : Parcelable