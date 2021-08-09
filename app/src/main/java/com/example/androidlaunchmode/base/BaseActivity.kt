package com.example.androidlaunchmode.base

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.androidlaunchmode.*

abstract class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onResume() {
        super.onResume()
        setCurrentActivity()
        initEvents()
    }

    private fun setCurrentActivity() {
        val textCurrentAct = findViewById<TextView>(R.id.text_current_activity)
        when (this) {
            is AActivity -> {
                textCurrentAct.text = "Activity: A"
            }
            is BActivity -> {
                textCurrentAct.text = "Activity: B"
            }
            is CActivity -> {
                textCurrentAct.text = "Activity: C"
            }
            is DActivity -> {
                textCurrentAct.text = "Activity: D"
            }
        }
    }

    private fun initEvents() {
        findViewById<Button>(R.id.button_start_A).setOnClickListener {
            startActivity(Intent(this, AActivity::class.java))
        }
        findViewById<Button>(R.id.button_start_B).setOnClickListener {
            startActivity(Intent(this, BActivity::class.java))
        }
        findViewById<Button>(R.id.button_start_C).setOnClickListener {
            startActivity(Intent(this, CActivity::class.java))
        }
        findViewById<Button>(R.id.button_start_D).setOnClickListener {
            startActivity(Intent(this, DActivity::class.java))
        }
    }
}