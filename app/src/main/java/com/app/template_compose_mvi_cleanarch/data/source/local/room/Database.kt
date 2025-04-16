package com.app.template_compose_mvi_cleanarch.data.source.local.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.app.template_compose_mvi_cleanarch.data.source.local.entity.Entity

@Database(entities = [Entity::class], version = 1, exportSchema = false)
abstract class Database : RoomDatabase() {

    abstract fun Dao(): Dao

}