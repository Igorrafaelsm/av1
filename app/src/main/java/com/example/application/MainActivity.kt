package com.example.application
 import android.content.Intent
 import android.os.Bundle
 import android.support.v7.app.AppCompatActivity
 import android.view.View
 import android.widget.Button
 import android.widget.EditText
 import android.widget.Toast
 import com.example.application.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(){


            private lateinit var binding: ActivityMainBinding

            lateinit var username: EditText
            lateinit var password: EditText
            lateinit var loginButton: Button

        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

            binding = ActivityMainBinding.inflate(layoutInflater)
            setContentView(binding.root)

            binding.loginButton.setOnClickListener(View.OnClickListener {
                if (binding.username.text.toString() == "user" && binding.password.text.toString() == "123"){
                    Toast.makeText(this, "Login Successful!", Toast.LENGTH_SHORT).show()
                    navegarTelaPrincipal()
                } else {
                    Toast.makeText(this, "Login Failed!", Toast.LENGTH_SHORT).show()

                }
            })
        }
            private fun navegarTelaPrincipal(){
                val intent = Intent (this,telaPrincipal::class.java )
                startActivity(intent)
                finish()
            }
  }
