package com.example.travailafaire

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.PopupMenu
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    lateinit var root : ConstraintLayout
    lateinit var Button : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        root = findViewById(R.id.root)
        Button= findViewById<Button>(R.id.button)
        Button.setOnClickListener{
            showPopupmeenu()
        }
    }
        fun showPopupmeenu(){

            val popupMenu = PopupMenu(this,Button)
            menuInflater.inflate(R.menu.popupmenu, popupMenu.menu)
            popupMenu.setOnMenuItemClickListener {
                when(it.itemId){
                    R.id.bleu ->{
                        root.setBackgroundColor((Color.BLUE))
                        true
                    }
                    R.id.rouge ->{
                        root.setBackgroundColor(Color.RED)
                        true
                    } else ->true
                }
            }
            popupMenu.show()
        }

}
