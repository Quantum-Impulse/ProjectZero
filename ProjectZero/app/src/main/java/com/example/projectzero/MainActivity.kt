package com.example.projectzero

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val RollButton = findViewById<Button>(R.id.RollButton)
        val ResultsTextView = findViewById<TextView>(R.id.ResultsTextView)
        val SeekBar = findViewById<SeekBar>(R.id.SeekBar)

        RollButton.setOnClickListener{
            val rand = Random.nextInt(SeekBar.progress) + 1
            ResultsTextView.text = rand.toString()
        }
    }
}
