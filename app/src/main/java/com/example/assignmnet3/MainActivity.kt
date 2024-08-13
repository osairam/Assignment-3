package com.example.assignmnet3

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val messageInput = findViewById<EditText>(R.id.editTextMessage)

        findViewById<Button>(R.id.buttonSend).setOnClickListener {
            val message = messageInput.text.toString()

            if (message.isEmpty()) {
                Toast.makeText(this, "No text entered. Please enter a message.", Toast.LENGTH_SHORT).show()
            } else {
                val intent = Intent(this, MotivationActivity::class.java).apply {
                    putExtra("MOTIVATION_MESSAGE", message)
                }
                startActivity(intent)
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_home -> {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                true
            }
            R.id.action_about -> {
                val intent = Intent(this, AboutActivity::class.java)
                startActivity(intent)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
