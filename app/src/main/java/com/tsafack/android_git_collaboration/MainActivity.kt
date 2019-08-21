package com.tsafack.android_git_collaboration

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val nombre1 = 10
    val nombre2 = 15

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        id_activity_cedrick.setOnClickListener {
            startActivity(Intent(this, CredickActivity::class.java))
        }

        Toast.makeText(applicationContext, "La somme des deux nombre est ${somme(nombre1, nombre2)}", Toast.LENGTH_LONG)
            .show()
    }

    fun somme(nb1: Int, nb2: Int) = nb1 + nb2
}
