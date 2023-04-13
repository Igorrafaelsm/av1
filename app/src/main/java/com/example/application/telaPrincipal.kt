package com.example.application

import android.annotation.SuppressLint
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.application.databinding.ActivityMainBinding
import com.example.application.databinding.ActivityTelaPrincipalBinding

class telaPrincipal : AppCompatActivity() {

    private lateinit var binding: ActivityTelaPrincipalBinding


    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTelaPrincipalBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.icNavegar.setOnClickListener {
        val navegarUltimatela = Intent(this,ultimaTela::class.java)
            startActivity(navegarUltimatela)
        }
    }
}