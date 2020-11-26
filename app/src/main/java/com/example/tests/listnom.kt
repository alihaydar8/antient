package com.example.tests

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity

class listnom : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.setContentView(R.layout.activity_listnom)

        var tex = findViewById<TextView>(R.id.titrea)
        var ok = findViewById<Button>(R.id.b2)
        var ok2 = findViewById<ImageButton>(R.id.imageButton1)
        var lesnom = findViewById<TextView>(R.id.parti1)
        var lenom = findViewById<TextView>(R.id.lenom)



        ok.setOnClickListener {
            var intent = Intent(this, MainActivity::class.java)
            intent.putExtra("Titre", tex.text.toString())
            startActivity(intent)

        }


        ok2.setOnClickListener {
            lesnom.text = lesnom.text.toString() + " \n " + lenom.text.toString()
        }}}
