package com.example.roomexample.room.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.roomexample.model.CreptoCurrency
import com.example.roomexample.model.Item
import com.example.roomexample.room.dao.ItemDao
import com.example.roomexample.room.dao.UserDao

@Database(entities = [Item ::class] , version = 1)

abstract class AppDataBase : RoomDatabase() {
   abstract fun itemDao() : ItemDao

}
