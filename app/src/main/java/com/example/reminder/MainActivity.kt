package com.example.reminder

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btReminders: Button = findViewById(R.id.btnReminders);

        btReminders.setOnClickListener{
            val intent = Intent(this, ReminderPage::class.java)
            startActivity(intent);
        }
    }
}