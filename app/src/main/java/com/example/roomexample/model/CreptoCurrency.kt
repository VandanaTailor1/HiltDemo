package com.example.roomexample.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class CreptoCurrency (
  //  @PrimaryKey val id :Int,
    val images:String,
    val name :String
)

