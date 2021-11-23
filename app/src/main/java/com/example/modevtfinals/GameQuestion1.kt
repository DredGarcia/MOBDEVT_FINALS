package com.example.modevtfinals

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.modevtfinals.databinding.ActivityGameQuestion1Binding

import java.util.TimerTask;
import java.util.Timer;

class GameQuestion1 : AppCompatActivity() {


    private lateinit var binding: ActivityGameQuestion1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGameQuestion1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonQ1A.setOnClickListener() {
            val intent = Intent(this, GameQuestion2::class.java)
            startActivity(intent)
        }

        binding.buttonQ1B.setOnClickListener() {
            val intent = Intent(this, GameQuestion2::class.java)
            startActivity(intent)
        }

        binding.buttonQ1C.setOnClickListener() {
            val intent = Intent(this, GameQuestion2::class.java)
            startActivity(intent)
        }

        binding.buttonQ1D.setOnClickListener() {
            val intent = Intent(this, GameQuestion2::class.java)
            startActivity(intent)
        }



    }
}