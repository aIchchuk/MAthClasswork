package com.example.mathclasswork

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.mathclasswork.databinding.ActivityMain3Binding
import com.example.mathclasswork.databinding.ActivityMain2Binding
import com.example.mathclasswork.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity3 : AppCompatActivity() {


    private lateinit var binding: ActivityMain3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val score = intent.getIntExtra("score", 0)
        binding.solutionView.text = "Score: $score"

        binding.okok.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        binding.nextBtn.setOnClickListener {
            finishAffinity()
        }
    }
}