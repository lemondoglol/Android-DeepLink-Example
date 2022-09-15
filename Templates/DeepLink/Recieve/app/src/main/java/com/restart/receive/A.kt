package com.restart.receive

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_a.*

class A : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)
        setSupportActionBar(toolbar)

        // process data from deeplink
        intent?.data?.let {
            val fn = it.getQueryParameter("FirstName")
            val ln = it.getQueryParameter("LastName")
            Toast.makeText(this, "Welcome: $fn $ln", Toast.LENGTH_SHORT).show()
        }
    }

}
