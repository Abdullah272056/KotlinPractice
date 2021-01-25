package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val  button=findViewById<Button>(R.id.buttonId);
        val  button1=findViewById<Button>(R.id.buttonId2);
        button.setOnClickListener(){
            val intent=Intent(this,MainActivity2::class.java);
            startActivity(intent)
            Toast.makeText(this,"Button click",Toast.LENGTH_SHORT).show();
        }
        button1.setOnClickListener(){
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)

            // Toast.makeText(this@MainActivity, "Button click!", Toast.LENGTH_SHORT).show();
            Toast.makeText(this,"Button click",Toast.LENGTH_SHORT).show();
        }

    }
}