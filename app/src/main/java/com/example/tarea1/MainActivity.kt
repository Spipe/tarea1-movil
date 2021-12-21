package com.example.tarea1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() , View.OnClickListener{
    var boton:Button ?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        boton = findViewById(R.id.actividadDos)
        boton!!.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        Toast.makeText(this,"Ir a la Actividad Dos",Toast.LENGTH_LONG).show()
        val intent = Intent(this,ButtonToActivity2::class.java)
        startActivity(intent)
    }
}