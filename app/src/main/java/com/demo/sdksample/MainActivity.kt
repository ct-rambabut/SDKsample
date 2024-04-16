package com.demo.sdksample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.demo.mylibrarytoast.Toaster

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClick = findViewById<Button>(R.id.btnclick)
        btnClick.setOnClickListener {
            // Define what happens when the button is clicked
            // For example, you could show a toast message
           // Toast.makeText(this, "Button clicked", Toast.LENGTH_SHORT).show()
            Toaster.simpleToast(this,"Button clicked from lib");
        }


    }
}