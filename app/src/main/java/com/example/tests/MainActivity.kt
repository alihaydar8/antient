package com.example.tests

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    private var userListe = mutableListOf<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        //   var recyclerView = findViewById<RecyclerView>(R.id.recy1)
        //    recyclerView.layoutManager = LinearLayoutManager(this)
        //     recyclerView.adapter = CustomAdapter(userListe as ArrayList<String>)

        setContentView(R.layout.activity_main)
        var pluss = findViewById<ImageButton>(R.id.imageButton1)
        val intent = this.intent

        var base1 = findViewById<Button>(R.id.base1)

        var t1 =intent.getStringExtra("Titre")
        base1.text =  t1


        base1.setOnClickListener {
          if(base1.toString()!="") {var i = Intent(this ,compte::class.java)
                startActivity(i)}
        }

        pluss.setOnClickListener {
            var intentplay = Intent(this, listnom::class.java)
            startActivity(intentplay) }
        if  (base1.text== "")
        { base1.setVisibility(View.INVISIBLE)
        }
    }
}