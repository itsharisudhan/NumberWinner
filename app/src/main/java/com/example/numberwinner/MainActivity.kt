package com.example.numberwinner

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnleft = findViewById<Button>(R.id.btnleft)
        val btnright = findViewById<Button>(R.id.btnright)
        val main = findViewById<Button>(R.id.main)
        btnleft.setOnClickListener{

            val leftnum = btnleft.text.toString().toInt()
            val rightnum = btnright.text.toString().toInt()

            if (leftnum>rightnum) {

            }
        }









    }
}