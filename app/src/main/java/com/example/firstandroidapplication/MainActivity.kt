package com.example.firstandroidapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        var inputName = personNameTextId.text
        confirmButtonId.setOnClickListener {

        if(inputName.isEmpty())
        {
            Toast.makeText(this, "Please, enter a name", Toast.LENGTH_LONG).show()
        }
        else
        {
            Toast.makeText(this, "Hi, $inputName", Toast.LENGTH_LONG).show()
        }

        }
    }
}
