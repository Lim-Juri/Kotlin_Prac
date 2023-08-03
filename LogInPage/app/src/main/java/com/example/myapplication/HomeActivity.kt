package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val strData = intent.getStringExtra("dataFromSignInActivity")
        val editID = findViewById<TextView>(R.id.textView)
        editID.text = getString(R.string.id_format, strData)

//        val strname = intent.getStringExtra("dataFromSignpActivity")
//        val editName = findViewById<TextView>(R.id.editname)
//        editName.text = getString(R.string.name_login, strname)

        val clickend = findViewById<Button>(R.id.finish)
        clickend.setOnClickListener{
            val clickintent = Intent(this, SignInActivity::class.java)
            startActivity(clickintent)
        }

    }
}