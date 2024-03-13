package com.example.roomexample.di

import com.example.roomexample.network.CryptoCurrencyImpl
import com.example.roomexample.network.CryptocurrencyRepositry
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent ::class)
class AppModule {
   @Provides
   @Singleton
   fun provideCryptocurrencyRepositry() : CryptocurrencyRepositry=CryptoCurrencyImpl()
}