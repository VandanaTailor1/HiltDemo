package com.example.roomexample.network

import com.example.roomexample.model.CreptoCurrency

class CryptoCurrencyImpl : CryptocurrencyRepositry{

    override fun getCryptoCcurrency() = listOf(
             CreptoCurrency("https://m.media-amazon.com/images/I/81QJ4TqbusL._AC_UF894,1000_QL80_.jpg", "BitCoin"),
             CreptoCurrency("https://ih1.redbubble.net/image.2419420177.4365/flat,750x,075,f-pad,750x1000,f8f8f8.jpg", "BitCoin"),
             CreptoCurrency("https://img.freepik.com/free-photo/3d-representation-hindu-deity-krishna_23-2151200191.jpg", "BitCoin"),
             CreptoCurrency("https://haribole.files.wordpress.com/2014/06/krishna-5.jpg", "BitCoin")
            )

}