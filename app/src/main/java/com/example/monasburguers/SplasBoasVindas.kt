package com.example.monasburguers

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.example.monasburguers.databinding.ActivitySplasBoasVindasBinding

class SplasBoasVindas : AppCompatActivity() {
    private lateinit var binding: ActivitySplasBoasVindasBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplasBoasVindasBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Handler(Looper.getMainLooper()).postDelayed({
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
            finish()
        },3000)
    }
}