package com.example.carlocus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {
    lateinit var myemail:EditText
    lateinit var mypassword:EditText
    lateinit var login:Button
    lateinit var signup:TextView
    lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myemail = findViewById(R.id.editTextEmail)
        mypassword = findViewById(R.id.editTextPassword)
        login = findViewById(R.id.Login)
        signup = findViewById(R.id.Register)
        auth = FirebaseAuth.getInstance()

        login.setOnClickListener {
            login()
        }

        signup.setOnClickListener {
            val intent = Intent(this,RegisterActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
    private fun login(){
        val email = myemail.text.toString()
        val pass = mypassword.text.toString()

        auth.signInWithEmailAndPassword(email,pass).addOnCompleteListener(this){
            if(it.isSuccessful){
                Toast.makeText(this,"Successfully LoggedIn", Toast.LENGTH_SHORT).show()
                val intent= Intent(this,HomeActivity::class.java)
                startActivity(intent)
            }
            else
                Toast.makeText(this,"Log in failed",Toast.LENGTH_SHORT).show()
        }
    }
}
