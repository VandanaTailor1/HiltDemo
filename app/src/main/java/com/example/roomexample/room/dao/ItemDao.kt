package com.example.roomexample.room.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.roomexample.model.Item


@Dao
interface ItemDao {
    @Insert
    suspend fun insert(item: Item)

    @Query("SELECT * FROM Item")
    suspend fun getAllItems(): List<Item>
}