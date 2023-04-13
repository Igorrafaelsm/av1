package com.example.application

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.application.databinding.ActivityTelaPrincipalBinding
import com.example.application.databinding.ActivityUltimaTelaBinding

class ultimaTela : AppCompatActivity() {

    private lateinit var binding: ActivityUltimaTelaBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUltimaTelaBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.icVoltar.setOnClickListener {
            val voltarTelaprincipal = Intent(this,telaPrincipal::class.java)
            startActivity(voltarTelaprincipal)
        }

    }
}