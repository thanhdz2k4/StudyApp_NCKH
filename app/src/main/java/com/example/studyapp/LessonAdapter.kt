package com.example.studyapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class LessonAdapter: RecyclerView.Adapter<LessonAdapter.ViewHolder>() {
    val nameOfLessons = arrayOf("Getting Started with C", " Statements", "Program Structure", "Output Formatting", "Variables")
    var exp = arrayOf(" +10", " +5", " +10", " +15", " +40")

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.lesson_item, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return nameOfLessons.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.nameOfLesson.text = nameOfLessons[position]
        holder.exp.text = exp[position]
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var nameOfLesson: TextView = itemView.findViewById(R.id.nameOfLesson)
        var exp: TextView = itemView.findViewById(R.id.expOfLesson)
    }
}