package com.example.roomexample.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.roomexample.model.CreptoCurrency
import com.example.roomexample.network.CryptocurrencyRepositry
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val cryptocurrencyRepositry: CryptocurrencyRepositry
) : ViewModel() {
     private val _cryptoCurrency = MutableLiveData<List<CreptoCurrency>>()
     val cryptoCurrency : LiveData<List<CreptoCurrency>> = _cryptoCurrency
    init {
      loadCryptoCurrency()
    }
    private fun loadCryptoCurrency(){
        _cryptoCurrency.value =cryptocurrencyRepositry.getCryptoCcurrency()
    }
}