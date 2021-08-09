package com.example.androidlaunchmode

import android.os.Bundle
import com.example.androidlaunchmode.base.BaseActivity

class AActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

}