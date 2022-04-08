package com.samagra.cascaded

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SearchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.search_main)
        findViewById<Button>(R.id.btn).setOnClickListener {
            startActivity(Intent(this, CascadedActivity::class.java))
            finish()
        }
    }
}