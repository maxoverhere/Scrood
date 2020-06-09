package com.example.scrood

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_list.*

class ListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        val intent = intent
        val value = intent.getStringExtra("key") //if it's a string you stored.

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        val restaurantsArrays = resources.getStringArray(R.array.name)
        val arrAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, restaurantsArrays)

        listMode.adapter = arrAdapter

        listMode.setOnItemClickListener { adapterView, view, position, id ->
            Toast.makeText(this, restaurantsArrays[position], Toast.LENGTH_SHORT).show()
            val myIntent = Intent(this, MenuListActivity::class.java)
            myIntent.putExtra("key", "value")
            this.startActivity(myIntent)
        }
    }
}