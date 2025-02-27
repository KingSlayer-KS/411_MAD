package com.example.sirjan_mad_114

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var text: EditText
    private lateinit var showName: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        text = findViewById(R.id.blank)
        showName = findViewById(R.id.helloName)
    }

    fun clickOn(view: View) {
        val name = text.text.toString()

        showName.text = "hello : $name"
    }
}
