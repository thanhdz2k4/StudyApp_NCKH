package com.example.studyapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class UnitAdapter: RecyclerView.Adapter<UnitAdapter.ViewHolder>() {

    val nameOfUnits = arrayOf("Basic Concepts", "Conditionals and Loops", "Arrays & Strings", "Function & Pointer")

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.unit_item, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.nameOfUnit.text = nameOfUnits[position]

        // Thiết lập RecyclerView con (Lessons) bên trong ViewHolder của RecyclerView cha
        val lessonAdapter = LessonAdapter()
        holder.recyclerViewLessons.layoutManager = LinearLayoutManager(holder.itemView.context, LinearLayoutManager.VERTICAL, false)
        holder.recyclerViewLessons.adapter = lessonAdapter
    }

    override fun getItemCount(): Int {
        return nameOfUnits.size
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var nameOfUnit: TextView = itemView.findViewById(R.id.NameUnit)
        var recyclerViewLessons: RecyclerView = itemView.findViewById(R.id.recyclerViewLessons)  // RecyclerView con
    }
}
