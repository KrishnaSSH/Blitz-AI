package com.krishna.blitzai.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.krishna.blitzai.database.entity.GeneratedImage
import kotlinx.coroutines.flow.Flow

@Dao
interface GeneratedImagesDao {

    @Query("SELECT * FROM GeneratedImage")
    fun getAll(): Flow<List<GeneratedImage>>

    @Insert
    suspend fun insert(image: GeneratedImage)

    @Delete
    suspend fun delete(image: GeneratedImage)
}