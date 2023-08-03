package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val clickend = findViewById<Button>(R.id.finish)
        val strData = intent.getStringExtra("dataFromSignInActivity")
        val editID = findViewById<TextView>(R.id.textView)
        editID.text = getString(R.string.id_format, strData)

        clickend.setOnClickListener{
            val clickintent = Intent(this, SignInActivity::class.java)
            startActivity(clickintent)
        }

    }
}