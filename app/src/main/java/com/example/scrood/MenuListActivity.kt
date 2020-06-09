package com.example.scrood

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MenuListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_list)
        val list = findViewById<ListView>(R.id.list)
        val arrayList: ArrayList<SubjectData> = ArrayList<SubjectData>()
        arrayList.add(
            SubjectData(
                "Egg muff",
                "https://mcdonalds.com.au/sites/mcdonalds.com.au/files/Product_thumb_Bacon%26EggMcMuffin_0.png"
            )
        )
        arrayList.add(
            SubjectData(
                "burger",
                "https://mcdonalds.com.au/sites/mcdonalds.com.au/files/Product_thumb_QuarterPounder-201904.png"
            )
        )
        arrayList.add(
            SubjectData(
                "chips",
                "https://mcdonalds.com.au/sites/mcdonalds.com.au/files/Product_thumb_Fries.png"
            )
        )
        arrayList.add(
            SubjectData(
                "ketchup",
                "https://mcdonalds.com.au/sites/mcdonalds.com.au/files/Product_thumb_Sauce-Ketchup.png"
            )
        )
        arrayList.add(
            SubjectData(
                "sprite",
                "https://mcdonalds.com.au/sites/mcdonalds.com.au/files/Product_thumb_Sprite.png"
            )
        )
        arrayList.add(
            SubjectData(
                "fudge",
                "https://mcdonalds.com.au/sites/mcdonalds.com.au/files/Product_thumb_Sundae-Hot-Fudge.png"
            )
        )
        arrayList.add(
            SubjectData(
                "mc flurry",
                "https://mcdonalds.com.au/sites/mcdonalds.com.au/files/Product_thumb_McFlurry-Oreo_0.png"
            )
        )
        arrayList.add(
            SubjectData(
                "choc cake",
                "https://mcdonalds.com.au/sites/mcdonalds.com.au/files/Product_thumb_Warm-Double-Choc-Cake.png"
            )
        )
        val customAdapter = CustomAdapter(applicationContext, arrayList)
        list.adapter = customAdapter
    }
}