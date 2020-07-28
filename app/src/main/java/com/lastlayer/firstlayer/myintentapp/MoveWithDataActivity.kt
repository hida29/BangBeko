package com.lastlayer.firstlayer.myintentapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_move_with_data.view.*

class MoveWithDataActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_PEN = "extra_pen"
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_AGE = "extra_age"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_with_data)

        val tvDataReceived: TextView = findViewById(R.id.tv_data_received)

        val name = intent.getStringExtra(EXTRA_NAME)
        val pen = intent.getStringExtra(EXTRA_PEN)
        val age = intent.getStringExtra(EXTRA_AGE, 0)

        val text = "Nama : $name, Address : $pen, Cabang : $age"
        tvDataReceived.text = text
    }
}
