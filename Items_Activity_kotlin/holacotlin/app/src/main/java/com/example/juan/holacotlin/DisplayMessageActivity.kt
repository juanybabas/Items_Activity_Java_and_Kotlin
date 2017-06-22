package com.example.juan.holacotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.TextView

class DisplayMessageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

        val intent = intent
        val message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE)
        val textView = TextView(this)
        textView.textSize = 60f
        textView.text = message

        val layout = findViewById(R.id.activity_display_message) as ViewGroup
        layout.addView(textView)
    }
}
