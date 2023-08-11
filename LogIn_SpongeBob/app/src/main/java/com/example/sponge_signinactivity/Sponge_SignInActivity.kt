package com.example.sponge_signinactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Sponge_SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name = findViewById<EditText>(R.id.edit_name)
        val password = findViewById<EditText>(R.id.edit_password)
        val email = findViewById<EditText>(R.id.edit_email)
        val number = findViewById<EditText>(R.id.edit_number)
        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            if (name.text.toString().trim().isBlank() || password.text.toString().trim().isBlank()
                || email.text.toString().trim().isBlank() || number.text.toString().trim().isBlank()
            ) {
                Toast.makeText(
                    this@Sponge_SignInActivity, "입력되지 않은 정보가 있습니다.",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                Log.d("JURI", "email:" + email.text.toString() + ", number:" + number.text.toString())
                Toast.makeText(this@Sponge_SignInActivity, "회원가입 완료!", Toast.LENGTH_SHORT).show()
                intent.putExtra("name", name.text.toString())
                intent.putExtra("password", password.text.toString())
                intent.putExtra("email", email.text.toString())
                intent.putExtra("number", number.text.toString())
                setResult(RESULT_OK,intent)
                finish()

            }
        }
    }
}