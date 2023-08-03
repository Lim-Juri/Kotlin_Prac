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
        log.setOnClickListener {
            val edit_id = findViewById<EditText>(R.id.edit1).text.toString()
            val edit_password = findViewById<EditText>(R.id.edit2).text.toString()

            if (edit_id.isBlank() && edit_password.isBlank()) {
                Toast.makeText(
                    this@SignInActivity,
                    "아이디와 비밀번호를 입력해주세요.",
                    Toast.LENGTH_SHORT
                ).show()
            } else if (edit_id.isBlank()) {
                Toast.makeText(
                    this@SignInActivity,
                    "아이디를 확인해주세요.",
                    Toast.LENGTH_SHORT
                ).show()
            } else if (edit_password.isBlank()) {
                Toast.makeText(
                    this@SignInActivity,
                    "비밀번호를 확인해주세요.",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                Toast.makeText(
                    this@SignInActivity,
                    "로그인 성공",
                    Toast.LENGTH_SHORT
                ).show()
                val logintent = Intent(this, HomeActivity::class.java)
                intent.putExtra("dataFromSignInActivity", edit_id)
                startActivity(logintent)
            }
        }

        val join = findViewById<Button>(R.id.button2)
        join.setOnClickListener {
            val joinintent = Intent(this, SignpActivity::class.java)
            startActivity(joinintent)
        }
    }
}