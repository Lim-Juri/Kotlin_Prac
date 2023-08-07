package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signp)

        val button = findViewById<Button>(R.id.button3)
        val name = findViewById<EditText>(R.id.editname)
        val id = findViewById<EditText>(R.id.editid)
        val password = findViewById<EditText>(R.id.editpassword)

        button.setOnClickListener {

            if (name.text.toString().isEmpty() && id.text.toString().isEmpty() && password.text.toString().isEmpty()) {
                Toast.makeText(
                    this@SignUpActivity,
                    "입력되지 않은 정보가 있습니다.",
                    Toast.LENGTH_SHORT
                ).show()
            } else if (name.text.toString().isEmpty()) {
                Toast.makeText(
                    this@SignUpActivity,
                    "아이디와 비밀번호를 입력해주세요.",
                    Toast.LENGTH_SHORT
                ).show()
            } else if (id.text.toString().isEmpty()) {
                Toast.makeText(
                    this@SignUpActivity,
                    "아이디를 입력해주세요.",
                    Toast.LENGTH_SHORT
                ).show()
            } else if (password.text.toString().isEmpty()) {
                Toast.makeText(
                    this@SignUpActivity,
                    "비밀번호를 입력해주세요.",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                intent.putExtra("id", id.text.toString())
                intent.putExtra("password",password.text.toString())
                setResult(RESULT_OK, intent)
                finish()
            }
        }
    }
}