package com.krishna.blitzai.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.krishna.blitzai.database.entity.GeneratedAudio
import kotlinx.coroutines.flow.Flow

@Dao
interface GeneratedAudiosDao {

    @Query("SELECT * FROM GeneratedAudio")
    fun getAll(): Flow<List<GeneratedAudio>>

    @Insert
    suspend fun insert(audio: GeneratedAudio)

    @Delete
    suspend fun delete(audio: GeneratedAudio)
}