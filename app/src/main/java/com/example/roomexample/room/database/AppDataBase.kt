package com.example.roomexample.room.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.roomexample.model.CreptoCurrency
import com.example.roomexample.room.dao.UserDao

@Database(entities = [CreptoCurrency ::class] , version = 1)
abstract class AppDataBase : RoomDatabase() {
   abstract fun UserDao() : UserDao

    object DatabaseBuilder {
        private var INSTANCE: AppDataBase? = null
        fun getInstance(context: Context): AppDataBase {
            if (INSTANCE == null) {
                synchronized(AppDataBase::class) {
                    INSTANCE = buildRoomDB(context)
                }
            }
            return INSTANCE!!
        }
        private fun buildRoomDB(context: Context) =
            Room.databaseBuilder(
                context.applicationContext,
                AppDataBase::class.java,
                "Learninggg"
            ).build()
    }
}
