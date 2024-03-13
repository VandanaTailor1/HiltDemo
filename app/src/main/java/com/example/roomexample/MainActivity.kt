package com.roomexample

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.roomexample.R
import com.example.roomexample.adapter.CryptocurrencyAdapter
import com.example.roomexample.databinding.ActivityMainBinding
import com.example.roomexample.model.Item
import com.example.roomexample.room.database.AppDataBase
import com.example.roomexample.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private val viewModel :MainViewModel by viewModels()
    @Inject
    lateinit var appDatabase: AppDataBase
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

        }
          binding.rvData.layoutManager=LinearLayoutManager(this)
        observeCryptoCurrency()

       
    }
    private fun observeCryptoCurrency() {
          viewModel.cryptoCurrency.observe(this)
          {
              binding.rvData.adapter=CryptocurrencyAdapter(it)

          }

    }
}