package com.websarva.wings.android.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.websarva.wings.android.calcapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    private fun checkNumberIsZero(tvCalcResult: TextView): Boolean {
        if (tvCalcResult.text.toString() != "0") return false
        return true
    }

    private fun addNumberTextView(tvCalcResult: TextView, numberButton: Button): TextView {
        tvCalcResult.text = buildString {
            append(tvCalcResult.text.toString())
            append(numberButton.text.toString())
        }

        return tvCalcResult
    }
}