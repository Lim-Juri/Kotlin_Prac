package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val log = findViewById<Button>(R.id.button)
        log.setOnClickListener{
            val edit_id = findViewById<EditText>(R.id.edit1).text.toString()
            val edit_password = findViewById<EditText>(R.id.edit2).text.toString()

            if (edit_id == "" || edit_password == "")
                Toast.makeText(
                    this@SignInActivity,
                    "입력되지 않은 정보가 있습니다.",
                    Toast.LENGTH_SHORT
                ). show()
            else {
                val logintent = Intent(this, HomeActivity::class.java)
                intent.putExtra("dataFromSignInActivity", edit_id)
                startActivity(logintent)
            }
        }

        val join = findViewById<Button>(R.id.button2)
        join.setOnClickListener{
            val joinintent = Intent(this, SignpActivity::class.java)
            startActivity(joinintent)
        }
    }
}