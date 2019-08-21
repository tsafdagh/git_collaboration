package com.tsafack.android_git_collaboration

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        id_activity_cedrick.setOnClickListener {
            startActivity(Intent(this, CredickActivity::class.java))
        }
    }
}
