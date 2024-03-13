package com.example.roomexample.network

import com.example.roomexample.model.CreptoCurrency


interface CryptocurrencyRepositry {

    fun getCryptoCcurrency() : List<CreptoCurrency>
}