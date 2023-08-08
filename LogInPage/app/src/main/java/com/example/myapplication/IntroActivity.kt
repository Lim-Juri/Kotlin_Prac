package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts

class IntroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)

        val button = findViewById<Button>(R.id.button_f)
        val nic = findViewById<EditText>(R.id.edit_nic)
        val age = findViewById<EditText>(R.id.edit_age2)
        val mbti = findViewById<EditText>(R.id.edit_mbti2)
        val strData = intent.getStringExtra("dataFromSignInActivity")

        button.setOnClickListener {
            if (nic.text.toString().isEmpty() || age.text.toString()
                    .isEmpty() || mbti.text.toString().isEmpty()
            ) {
                Toast.makeText(
                    this@IntroActivity,
                    "입력되지 않은 정보가 있습니다.",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                Toast.makeText(
                    this@IntroActivity,
                    "입력 완료!",
                    Toast.LENGTH_SHORT
                ).show()

                val buttonintent = Intent(this, HomeActivity::class.java)
                buttonintent.putExtra("nic", nic.text.toString())
                buttonintent.putExtra("age", age.text.toString())
                buttonintent.putExtra("mbti", mbti.text.toString())
                buttonintent.putExtra("dataFromSignInActivity", strData.toString())
                startActivity(buttonintent)
            }
        }
    }
}
