package com.example.modevtfinals

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.modevtfinals.databinding.ActivityGameQuestion2Binding
import com.example.modevtfinals.viewModel.MainViewModel

class GameQuestion2 : AppCompatActivity() {
    private lateinit var binding: ActivityGameQuestion2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGameQuestion2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        val viewModel by viewModels<MainViewModel>()
        viewModel.data.observe(this)
        {
            binding.textViewToken2.text = "Token $it"
        }


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