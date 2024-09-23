package com.example.nckh1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CourseAdapter: RecyclerView.Adapter<CourseAdapter.ViewHolder>() {

    val languages = arrayOf("C++", "C#", "Java", "kotlin")
    var titles = arrayOf("Introduction to C++", "Introduce to C#", "Introduce to Java", "Introduce to Kotlin")

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        val v = LayoutInflater.from(viewGroup.context).inflate(R.layout.course_item, viewGroup, false)
        return  ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemTitle.text = titles[position]
        holder.itemLanguage.text = languages[position]
    }

    override fun getItemCount(): Int {
        return titles.size
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var itemLanguage: TextView
        var itemTitle: TextView

        init {
            itemLanguage = itemView.findViewById((R.id.item_language))
            itemTitle = itemView.findViewById(R.id.item_title)
        }
    }

}