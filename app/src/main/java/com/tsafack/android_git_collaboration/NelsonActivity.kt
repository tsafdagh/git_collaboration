package com.tsafack.android_git_collaboration

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class NelsonActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nelson)
        Toast.makeText(this,"Bienvenu dans lactivite de nelson",Toast.LENGTH_LONG).show()
    }
}
