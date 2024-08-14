package com.example.numberwinner

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import kotlin.random.Random


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnleft = findViewById<Button>(R.id.btnleft)
        val btnright = findViewById<Button>(R.id.btnright)
        val main = findViewById<ConstraintLayout>(R.id.main)
        fun newfunc() {
            val leftnum = Random.nextInt(10)
            var rightnum = Random.nextInt(10)
            while (rightnum == leftnum) {
                rightnum = Random.nextInt(10)
            }
            btnleft.text = leftnum.toString()
            btnright.text = rightnum.toString()
        }


        btnleft.setOnClickListener {

                val leftnum = btnleft.text.toString().toInt()
                val rightnum = btnright.text.toString().toInt()

                if (leftnum > rightnum) {
                    main.setBackgroundColor(Color.GREEN)
                    Toast.makeText(this, "answer is correct", Toast.LENGTH_SHORT).show()

                } else {
                    main.setBackgroundColor(Color.RED)
                    Toast.makeText(this, "answer is wrong", Toast.LENGTH_SHORT).show()
                }
                newfunc()

            }
        btnright.setOnClickListener {

            val leftnum = btnleft.text.toString().toInt()
            val rightnum = btnright.text.toString().toInt()

            if (leftnum < rightnum) {
                main.setBackgroundColor(Color.GREEN)
                Toast.makeText(this, "answer is correct", Toast.LENGTH_SHORT).show()

            } else {
                main.setBackgroundColor(Color.RED)
                Toast.makeText(this, "answer is wrong", Toast.LENGTH_SHORT).show()
            }
            newfunc()

        }

        }

    }



