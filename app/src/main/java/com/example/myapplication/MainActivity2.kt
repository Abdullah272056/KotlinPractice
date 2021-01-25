package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val  button=findViewById<Button>(R.id.buttonId);
        button.setOnClickListener {
            Toast.makeText(this,"click",Toast.LENGTH_SHORT).show();
        }
    }
}