package com.example.sponge_signinactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts

class Sponge_LogInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sponge_log_in)

        var activityResultLauncher: ActivityResultLauncher<Intent>
        val edit_n = findViewById<EditText>(R.id.edit_name2)
        val edit_p = findViewById<EditText>(R.id.edit_password2)

        var email:String?=null
        var phone:String?=null

        activityResultLauncher =
            registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
                if (it.resultCode== RESULT_OK){
                    val na = it.data?.getStringExtra("name") ?: ""
                    edit_n.setText(na)
                    val pa = it.data?.getStringExtra("password") ?: ""
                    edit_p.setText(pa)
                    phone = it.data?.getStringExtra("number")?:""
                    email = it.data?.getStringExtra("email")?:""
                }
            }

        val login = findViewById<Button>(R.id.button2)

        login.setOnClickListener{
            if (edit_n.text.toString().trim().isBlank() || edit_p.text.toString().trim().isBlank()) {
                Toast.makeText(
                    this@Sponge_LogInActivity,
                    "입력되지 않은 정보가 있습니다.",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                Toast.makeText(
                    this@Sponge_LogInActivity,
                    "로그인 성공",
                    Toast.LENGTH_SHORT
                ).show()

                Log.d("JURI", "email:$email, number:$phone")

                val log = Intent(this, Sponge_MainActivity::class.java)
                log.putExtra("name", edit_n.text.toString())
                log.putExtra("email", email)
                log.putExtra("number", phone)
                startActivity(log)
            }
        }

        val si = findViewById<Button>(R.id.button3)
        si.setOnClickListener {
            val signup = Intent(this, Sponge_SignInActivity::class.java)
            activityResultLauncher.launch(signup)
        }
    }
}