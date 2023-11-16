package com.example.monasburguers

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.example.monasburguers.databinding.ActivitySplasConfecionamentoBinding

class SplasConfecionamento : AppCompatActivity() {
    private lateinit var binding: ActivitySplasConfecionamentoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplasConfecionamentoBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_splas_confecionamento)

        Handler(Looper.getMainLooper()).postDelayed({
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
            finish()
        },3000)
    }
}