package com.mat.linkthis

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonOpenActivity.setOnClickListener { openActivityList() }
    }

    fun openActivityList(){
        val intent = Intent(this, ListActivity::class.java)
        startActivity(intent)
    }
}