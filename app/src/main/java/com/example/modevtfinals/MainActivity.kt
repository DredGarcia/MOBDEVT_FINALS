package com.example.modevtfinals

import android.annotation.SuppressLint

import android.os.CountDownTimer

import android.view.View

import android.widget.Button

import android.widget.TextView


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.modevtfinals.databinding.ActivityMainBinding
import com.example.modevtfinals.viewModel.MainViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonStart.setOnClickListener {
            val intent = Intent(this, GameQuestion1::class.java)
            startActivity(intent)
        }
        binding.buttonHow.setOnClickListener {
            val intent = Intent(this, GameHowToPlay::class.java)
            startActivity(intent)
        }
        binding.buttonAbout.setOnClickListener {
            val intent = Intent(this, GameAbout::class.java)
            startActivity(intent)
        }
    }
}