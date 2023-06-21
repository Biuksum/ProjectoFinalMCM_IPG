package com.example.projectofinalmcm_ipg

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.projectofinalmcm_ipg.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var bindiing: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindiing = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindiing.root)


        bindiing.recyclerview.layoutManager = LinearLayoutManager(this)

        getAllProducts()
    }

    private fun getAllProducts() {
        TODO("Not yet implemented")
    }
}