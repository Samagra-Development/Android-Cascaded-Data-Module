package com.samagra.cascaded

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class CascadedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cascaded_main)
        findViewById<Button>(R.id.btn).setOnClickListener {
            startActivity(Intent(this, SearchActivity::class.java))
            finish()
        }
    }
}