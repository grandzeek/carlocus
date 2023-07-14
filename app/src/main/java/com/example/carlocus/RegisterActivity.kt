package com.example.carlocus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class RegisterActivity : AppCompatActivity() {
    lateinit var myemail: EditText
    lateinit var mypassword: EditText
    lateinit var myconfpassword: EditText
    lateinit var signup: Button
    lateinit var mylogin: TextView
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        myemail = findViewById(R.id.editTextEmail)
        mypassword = findViewById(R.id.editTextPassword)
        myconfpassword = findViewById(R.id.editTextConfPassword)
        signup = findViewById(R.id.Register)
        mylogin = findViewById(R.id.Login0)
        auth = FirebaseAuth.getInstance()

        mylogin.setOnClickListener {
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        }
        signup.setOnClickListener {
            SignUpUser()
        }
    }
    private fun SignUpUser(){
        val email=myemail.text.toString()
        val pass=mypassword.text.toString()
        val confirmpass=myconfpassword.text.toString()

        if(email.isBlank() || pass.isBlank() ||confirmpass.isBlank()){
            Toast.makeText(this,"Fill Email and Password", Toast.LENGTH_SHORT).show()
            return
        }
        else if(pass !=confirmpass){
            Toast.makeText(this,"Password do not match",Toast.LENGTH_SHORT).show()
            return
        }
        val addOnCompleteListener =
            auth.createUserWithEmailAndPassword(email, pass).addOnCompleteListener(this){
                if(it.isSuccessful){
                    Toast.makeText(this,"Signed up successfully", Toast.LENGTH_SHORT).show()
                }
                else{
                    Toast.makeText(this,"Failed to create",Toast.LENGTH_SHORT).show()
                }
            }
    }
}