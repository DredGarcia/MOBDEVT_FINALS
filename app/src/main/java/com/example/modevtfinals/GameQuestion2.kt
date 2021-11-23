package com.example.modevtfinals

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.modevtfinals.databinding.ActivityGameQuestion2Binding

class GameQuestion2 : AppCompatActivity() {
    private lateinit var binding: ActivityGameQuestion2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGameQuestion2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonQ2A.setOnClickListener(){
            val intent = Intent(this, GameQuestion3::class.java)
            startActivity(intent)
        }

        binding.buttonQ2B.setOnClickListener(){
            val intent = Intent(this, GameQuestion3::class.java)
            startActivity(intent)
        }

        binding.buttonQ2C.setOnClickListener(){
            val intent = Intent(this, GameQuestion3::class.java)
            startActivity(intent)
        }
        binding.buttonQ2D.setOnClickListener(){
            val intent = Intent(this, GameQuestion3::class.java)
            startActivity(intent)
        }
    }
}