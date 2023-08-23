package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import com.example.mainactivity.R
import com.example.mainactivity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.apply {
            fragment1Btn.setOnClickListener{
                setFragment(FirstFragment())
            }
            fragment2Btn.setOnClickListener {
                setFragment(SecondFragment())
            }
        }
        setFragment(FirstFragment())
    }

    private fun setFragment(frag : Fragment) {
        supportFragmentManager.commit {
            replace(R.id.frameLayout, frag)
            setReorderingAllowed(true)
            addToBackStack("")
        }
    }
}