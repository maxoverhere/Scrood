package com.example.scrood

import android.content.Context
import android.database.DataSetObserver
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.ListAdapter
import android.widget.TextView
import android.widget.Toast
import com.squareup.picasso.Picasso
import java.util.*

internal class CustomAdapter(
    var context: Context,
    var arrayList: ArrayList<SubjectData>
) : ListAdapter {
    override fun areAllItemsEnabled(): Boolean {
        return false
    }

    override fun isEnabled(position: Int): Boolean {
        return true
    }

    override fun registerDataSetObserver(observer: DataSetObserver) {}
    override fun unregisterDataSetObserver(observer: DataSetObserver) {}
    override fun getCount(): Int {
        return arrayList.size
    }

    override fun getItem(position: Int): Any {
        return position
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun hasStableIds(): Boolean {
        return false
    }

    override fun getView(
        position: Int,
        convertView: View?,
        parent: ViewGroup
    ): View {
        var convertView = convertView
        val subjectData = arrayList[position]
        if (convertView == null) {
            val layoutInflater = LayoutInflater.from(context)
            convertView = layoutInflater.inflate(R.layout.menu_row, null)
            convertView.setOnClickListener {
                Toast.makeText(context, arrayList[position].toString(), Toast.LENGTH_SHORT).show()
            }
            val tittle = convertView.findViewById<TextView>(R.id.title)
            val imag = convertView.findViewById<ImageView>(R.id.list_image)
            tittle.text = subjectData.restaurantName
            Picasso.with(context)
                .load(subjectData.imageUrl)
                .into(imag)
        }
        return convertView!!
    }

    override fun getItemViewType(position: Int): Int {
        return position
    }

    override fun getViewTypeCount(): Int {
        return arrayList.size
    }

    override fun isEmpty(): Boolean {
        return false
    }

}

data class SubjectData(
    var restaurantName: String,
    var imageUrl: String
)