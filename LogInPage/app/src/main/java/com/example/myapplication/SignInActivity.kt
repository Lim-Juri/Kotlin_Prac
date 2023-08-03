package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edit_id = findViewById<EditText>(R.id.edit1)
        val edit_password = findViewById<EditText>(R.id.edit2)

        val log = findViewById<Button>(R.id.button)
        log.setOnClickListener {


            if (edit_id.text.toString().isBlank() && edit_password.text.toString().isBlank()) {
                Toast.makeText(
                    this@SignInActivity,
                    "아이디와 비밀번호를 입력해주세요.",
                    Toast.LENGTH_SHORT
                ).show()
            } else if (edit_id.text.toString().isBlank()) {
                Toast.makeText(
                    this@SignInActivity,
                    "아이디를 확인해주세요.",
                    Toast.LENGTH_SHORT
                ).show()
            } else if (edit_password.text.toString().isBlank()) {
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
                logintent.putExtra("dataFromSignInActivity", edit_id.text.toString())
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