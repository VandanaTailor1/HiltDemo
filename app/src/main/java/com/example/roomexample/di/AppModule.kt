package com.example.roomexample.di

import android.content.Context
import androidx.room.Room
import com.example.roomexample.network.CryptoCurrencyImpl
import com.example.roomexample.network.CryptocurrencyRepositry
import com.example.roomexample.room.database.AppDataBase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent ::class)
class AppModule {
   @Provides
   @Singleton
   fun provideCryptocurrencyRepositry() : CryptocurrencyRepositry=CryptoCurrencyImpl()

   @Provides
   fun provideAppDatabase(@ApplicationContext appContext: Context): AppDataBase {
      return Room.databaseBuilder(
         appContext,
         AppDataBase::class.java,
         "my-database"
      ).build()
   }


}


