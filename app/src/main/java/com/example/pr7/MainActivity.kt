package com.example.pr7

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.view.Menu
import android.view.MenuItem
import android.view.TextureView
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    override  fun onCreateOptionsMenu(menu : Menu?) : Boolean    {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val textView : TextView = findViewById(R.id.textView)

        when (item.itemId){
             R.id.action1 -> {
                 textView.text = "its frst"
                 colorChanger(Color.RED)
                 Toast.makeText(applicationContext, "its blue", Toast.LENGTH_SHORT).show()
                 return true }
            R.id.action2 -> {
                textView.text = "its scnd"
                colorChanger(Color.BLUE)
                Toast.makeText(applicationContext, "its blue",Toast.LENGTH_SHORT).show()
                return true }
            R.id.action3 -> {
                textView.text = "its thrd"
                Toast.makeText(applicationContext, "its green",Toast.LENGTH_SHORT).show()
                colorChanger(Color.GREEN)
                return true }
        }
        return super.onOptionsItemSelected(item)
    }
    fun colorChanger (curColor: Int) {
        setContentView(R.layout.activity_main)
        val lt : View? = findViewById(R.id.LT)
        if (lt != null) {
            lt.setBackgroundColor(curColor)
        }
    }

}
