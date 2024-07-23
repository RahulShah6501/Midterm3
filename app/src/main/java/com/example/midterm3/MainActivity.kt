// src/main/java/com/example/midterm3/MainActivity.kt
package com.example.midterm3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val openRecipeFinderButton: Button = findViewById(R.id.open_recipe_finder_button)

        openRecipeFinderButton.setOnClickListener {
            // Open Recipe Finder app
            val intent = Intent().apply {
                setClassName("com.example.midterm2", "com.example.midterm2.MainActivity")
                putExtra("cuisineType", "Italian") // Example data
            }
            startActivity(intent)
        }
    }
}
