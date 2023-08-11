package com.example.sponge_signinactivity

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import android.widget.ResourceCursorAdapter
import android.widget.TextView
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.res.ResourcesCompat

class Sponge_MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sponge_main)


        val namein = intent.getStringExtra("name")
        val numberin = intent.getStringExtra("number")
        val emailin = intent.getStringExtra("email")

        val editname = findViewById<TextView>(R.id.come_name)
        editname.text = getString(R.string.name_format, namein)
        val editphone = findViewById<TextView>(R.id.come_phone)
        editphone.text = getString(R.string.phone_format,numberin)
        val editemail = findViewById<TextView>(R.id.come_email)
        editemail.text = getString(R.string.email_format, emailin)


        val click = findViewById<ConstraintLayout>(R.id.finish)
        click.setOnClickListener{
            finish()
        }


        val imagesee = findViewById<ImageView>(R.id.sponge)
        val image = when((1..6).random()) {
            1 -> R.drawable.sp_ang
            2 -> R.drawable.sp_fr
            3 -> R.drawable.sp_bl
            4 -> R.drawable.sp_fun
            5 -> R.drawable.sp_sea
            6 -> R.drawable.sp_j
            else -> R.drawable.sp_imag
        }

        imagesee.setImageDrawable(ResourcesCompat.getDrawable(resources, image, null))
    }
}