package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.HideReturnsTransformationMethod
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val password = findViewById<EditText>(R.id.passwordET)
        password.setOnClickListener {
            password.transformationMethod =
                HideReturnsTransformationMethod.getInstance()
        }


    }
}