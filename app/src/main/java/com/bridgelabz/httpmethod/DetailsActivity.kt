package com.bridgelabz.httpmethod

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DetailsActivity : AppCompatActivity() {
    private lateinit var resultsTextView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        resultsTextView = findViewById(R.id.resultTextView)
        val results = intent.getStringExtra("json_results")

        resultsTextView.text = results
    }
}