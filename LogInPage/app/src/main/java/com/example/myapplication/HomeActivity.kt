package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.res.ResourcesCompat
import kotlin.random.Random

class HomeActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        var activityResultLauncher2: ActivityResultLauncher<Intent>
        val nic = findViewById<EditText>(R.id.edit_nic)
        val age = findViewById<EditText>(R.id.edit_age2)
        val mbti = findViewById<EditText>(R.id.edit_mbti2)

        val clickend = findViewById<ConstraintLayout>(R.id.finish)
        val strData = intent.getStringExtra("dataFromSignInActivity")
        val strData1 = intent.getStringExtra("nic")
        val strData2 = intent.getStringExtra("age")
        val strData3 = intent.getStringExtra("mbti")

        val editID = findViewById<TextView>(R.id.textView)
        editID.text = getString(R.string.id_format, strData)
        val editnic = findViewById<TextView>(R.id.textView2)
        editnic.text = getString(R.string.ki_format, strData1)
        val editage = findViewById<TextView>(R.id.textView3)
        editage.text = getString(R.string.age_format, strData2)
        val editmbti = findViewById<TextView>(R.id.textView4)
        editmbti.text = getString(R.string.mbti_format, strData3)

        activityResultLauncher2 =
            registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
                if (it.resultCode == RESULT_OK) {
                    val nn = it.data?.getStringExtra("nic") ?: ""
                    nic.setText(nn)
                    val gg = it.data?.getStringExtra("age") ?: ""
                    age.setText(gg)
                    val mm = it.data?.getStringExtra("mbti") ?: ""
                    mbti.setText(mm)
                }
            }

        clickend.setOnClickListener {
            finish()
        }

        val imageLayout = findViewById<ConstraintLayout>(R.id.back_all)
        val image = when ((1..5).random()) {
            1 -> R.drawable.cat
            2 -> R.drawable.dog
            3 -> R.drawable.dog2
            4 -> R.drawable.dog3
            5 -> R.drawable.img
            else -> R.drawable.cat
        }

        imageLayout.setBackgroundResource(image)

    }
}

