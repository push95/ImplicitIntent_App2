package com.example.implicitintent_app2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btn_click :Button?=null
        btn_click=findViewById(R.id.btn_click)
        btn_click.setOnClickListener{
            val intent=Intent("example.implicit_intent")
            startActivity(intent)
        }


    }

}
