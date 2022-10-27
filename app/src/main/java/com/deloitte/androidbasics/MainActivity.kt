package com.deloitte.androidbasics

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

//4 components - activity,service,broadcast reciever,content provider

class MainActivity : AppCompatActivity() {

  //1.Linear layout
  //2.Constraint layout
  //3.Relative layout
  //test git
  private lateinit var clickButton: Button

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    clickButton = findViewById(R.id.bt1)
    clickButton.setOnClickListener {
      val intent  = Intent(this,MainActivity2::class.java)
      startActivity(intent)
    }
  }

}