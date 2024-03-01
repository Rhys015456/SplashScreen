package com.example.splashscreen

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ItalianHomeScreen : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_italian_home_screen)
        val textView1: TextView = findViewById<TextView>(R.id.textView)
        val changeTextButton1: Button = findViewById<Button>(R.id.english)

        changeTextButton1.setOnClickListener {
            textView1.text = "Hello world"
        }


        val textView2: TextView = findViewById<TextView>(R.id.textView)
        val changeTextButton2: Button = findViewById<Button>(R.id.Afrikaans)

        changeTextButton2.setOnClickListener {
            textView2.text = "Hello Wêreld"

        }
        val textView3: TextView = findViewById<TextView>(R.id.textView)
        val changeTextButton3: Button = findViewById<Button>(R.id.Zulu)

        changeTextButton3.setOnClickListener {
            textView3.text = "Sawubona Mhlaba"

        }
        val textView4: TextView = findViewById<TextView>(R.id.textView)
        val changeTextButton4: Button = findViewById<Button>(R.id.xhosa)

        changeTextButton4.setOnClickListener {
            textView4.text = "Molo Lizwe"
        }
        val textView5: TextView = findViewById<TextView>(R.id.textView)
        val changeTextButton5: Button = findViewById<Button>(R.id.Italian)

        changeTextButton5.setOnClickListener {
            textView5.text = "Ciao mondo"
        }
    }
}