package com.example.roomexample.room.dao


import androidx.room.Dao
import androidx.room.Insert

import com.example.roomexample.model.CreptoCurrency

@Dao
interface UserDao {

    @Insert
    fun insertAll(cryptocurrrecyData : List<CreptoCurrency>)


}