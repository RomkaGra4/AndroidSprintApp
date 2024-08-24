package com.example.androidsprintapp

import androidx.appcompat.app.AppCompatActivity
import com.example.androidsprintapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
    }
}
