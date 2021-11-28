package com.example.modevtfinals

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.modevtfinals.databinding.ActivityGameQuestion1Binding
import com.example.modevtfinals.viewModel.MainViewModel
import com.google.android.material.snackbar.Snackbar

import java.util.TimerTask;
import java.util.Timer;

class GameQuestion1 : AppCompatActivity() {


    private lateinit var binding: ActivityGameQuestion1Binding
    private val questions = arrayOf("1. What year did De La Salle - College of Saint Benilde was founded?", "2. Who is the current President of De La Salle College of Saint Benilde", "There are three main campuses in CSB, which is a 14 storey academic building and a big playground for creative minds that stimulates students innovative ideas and to think outside of the box.", "Which of the following is not a Benildean core value?", "Fill in the blank in our  with the correct word among the choices below:" +
            "    \"De La Salle-College of Saint Benilde, a member of De La Salle Philippines, is a Catholic, dynamic, and innovative learning community. Guided by the Lasallian principles of _ _ _ _ _, Zeal in Service and Communion in Mission, it recognizes the uniqueness of every individual and responds to the diverse needs of all learners.\"")
    private val choice1 = arrayOf("A. 1975", "A. Br. Andrew Gonzalez", "A. Taft", "A. Perseverance and Forthright", "A. Faith")
    private val choice2 = arrayOf("B. 1978", "B. Br. Armin Luistro", "B. SDA", "B. professional competence", "B. Duty")
    private val choice3 = arrayOf("C. 1980", "C. Br. Dennis Magbanua", "C. AKIC", "C. appreciation of individual worth", "C. Optimism")
    private val choice4 = arrayOf("D. 1982", "D. Bro. Edmundo Fernandez", "D. ATRIUM", "D. Sense of Nationhood", "D. Love")
    private var counter = 0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGameQuestion1Binding.inflate(layoutInflater)
        setContentView(binding.root)
        val viewModel by viewModels<MainViewModel>()
        viewModel.data.observe(this)
        {
            binding.textViewToken.text = "Token $it"
        }

        nextQuestion()

        binding.buttonQ1A.setOnClickListener() {
            when (counter) {
                3 -> {
                    correct(viewModel)
                }
                4 -> {
                    correct(viewModel)
                }
                else -> {
                    wrong(viewModel)
                }
            }
        }

        binding.buttonQ1B.setOnClickListener() {
            wrong(viewModel)
        }

        binding.buttonQ1C.setOnClickListener() {
            when (counter) {
                0 -> {
                    correct(viewModel)
                }
                2 -> {
                    correct(viewModel)
                }
                else -> {
                    wrong(viewModel)
                }
            }
        }

        binding.buttonQ1D.setOnClickListener() {

            if(counter == 1){
                correct(viewModel)
            }
            else{
                wrong(viewModel)
            }
        }
    }

    private fun wrong(viewModel: MainViewModel) {
        viewModel.wrongAnswer()
        Snackbar.make(
            binding.root, "Wrong",
            Snackbar.LENGTH_LONG
        ).show()
        counter++
        nextQuestion()
    }

    private fun correct(viewModel: MainViewModel) {
        viewModel.correctAnswer()
        Snackbar.make(
            binding.root, "Correct",
            Snackbar.LENGTH_LONG
        ).show()
        counter++
        nextQuestion()
    }

    private fun nextQuestion() {
        binding.textView4.text = questions[counter]
        binding.buttonQ1A.text = choice1[counter]
        binding.buttonQ1B.text = choice2[counter]
        binding.buttonQ1C.text = choice3[counter]
        binding.buttonQ1D.text = choice4[counter]
    }
}