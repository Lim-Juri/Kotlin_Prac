package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SignpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signp)

        val name = findViewById<EditText>(R.id.editname).text.toString()
        val id = findViewById<EditText>(R.id.editid).text.toString()
        val password = findViewById<EditText>(R.id.editpassword).text.toString()
        val button = findViewById<Button>(R.id.button3)
        button.setOnClickListener {

        if (name == "" || id == "" || password == "")
                Toast.makeText(
                    this@SignpActivity,
                    "입력되지 않은 정보가 있습니다.",
                    Toast.LENGTH_SHORT
                ).show()
            else {
                finish()
            }
        }
    }
}