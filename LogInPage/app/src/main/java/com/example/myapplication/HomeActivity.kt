package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.res.ResourcesCompat
import kotlin.random.Random

class HomeActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)


        val clickend = findViewById<ConstraintLayout>(R.id.finish)
        val strData = intent.getStringExtra("dataFromSignInActivity")
        val editID = findViewById<TextView>(R.id.textView)
        editID.text = getString(R.string.id_format, strData)

        clickend.setOnClickListener {
            finish()
        }

        val imageLayout = findViewById<ConstraintLayout>(R.id.back_all)
        val image = when ((1..5).random()) {
            1 -> R.drawable.cat
            2 -> R.drawable.dog
            3 -> R.drawable.dog2
            4 -> R.drawable.dog3
            5 -> R.drawable.img
            else -> R.drawable.cat
        }

        imageLayout.setBackgroundResource(image)

    }
}
