package com.tsafack.android_git_collaboration

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this,"je suis entrain de creer un conflit",Toast.LENGTH_LONG).show()
        id_activity_cedrick.setOnClickListener {
            startActivity(Intent(this, CredickActivity::class.java))
        }
    }
}
