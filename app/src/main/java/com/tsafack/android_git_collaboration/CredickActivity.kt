package com.tsafack.android_git_collaboration

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_credi.*

class CredickActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_credi)

        id_btn_activity.setOnClickListener {
            startActivity(Intent(this, NelsonActivity::class.java))
        }
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(applicationContext, "Salut bien venue dans l'activité de Cédrick", Toast.LENGTH_LONG).show()
    }
}
