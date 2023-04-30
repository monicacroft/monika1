package com.example.monika

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            val textView = findViewById<TextView>(R.id.textView)
            val editText = findViewById<EditText>(R.id.editTextTextPersonName)
            val okayButton = findViewById<Button>(R.id.button)

            okayButton.setOnClickListener {
                val name = editText.text.toString()
                textView.text = getString(R.string.hello_name)
            }
        }
    }
