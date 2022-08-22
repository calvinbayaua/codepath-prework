package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

// User input
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Change text color
        findViewById<Button>(R.id.button).setOnClickListener {
            Log.i("Calvin", "Tapped on button")
            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.white))
        }

        // Change background color
        findViewById<Button>(R.id.button2).setOnClickListener {
            Log.i("Calvin", backgroundCount.toString())
            findViewById<ConstraintLayout>(R.id.background).setBackgroundColor(getResources().getColor(R.color.teal_200))
        }

        // Change text
        findViewById<Button>(R.id.button3).setOnClickListener {
            findViewById<TextView>(R.id.textView).setText(findViewById<EditText>(R.id.editTextTextPersonName).getText())
        }
    }
}