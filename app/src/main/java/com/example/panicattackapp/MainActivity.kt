package com.example.panicattackapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun panicbutton(view: View) {
        val panicIntent = Intent(this, PanicActivity::class.java)
        startActivity(panicIntent)
    }

    fun advicesbutton(view: View) {
        val advicesIntent = Intent(this, AdvicesActivity::class.java)
        startActivity(advicesIntent)
    }

    fun breathbutton(view: View) {
        val breathIntent = Intent(this, BreathActivity::class.java)
        startActivity(breathIntent)
    }

    fun soundsbutton(view: View) {
        val soundsIntent = Intent(this, SoundsActivity::class.java)
        startActivity(soundsIntent)
    }

    fun theorybutton(view: View) {
        val theoryIntent = Intent(this, TheoryActivity::class.java)
        startActivity(theoryIntent)
    }
}