package com.example.nckh1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PaperContentAdapter: RecyclerView.Adapter<PaperContentAdapter.ViewHolder>() {

    val titles = arrayOf("Introduce C", "Welcome to C!", "Output", "Code Playground")
    val contents = arrayOf("<b>C</b> is a general-purpose programming language that has been around for nearly 50 years.\\n\\n<b>C</b> has been used to write everything from operating systems (including Windows and many others) to complex programs like the Python interpreter, Git, Oracle, database, and more.",
    "In this course you will learn how to create real programs in C, perform various operation, solve real challenges, and much more!",
    "Most computer programs are designed to produce output. Here are some examples: " +
            "\n- You're got a new message notification " +
            "\n- Game Over display on the screen when playing video games " +
            "\n- Your account balance when checking your online banking app " +
            "\n\n The simplest output consists of displaying a message on the screen",
    "Our course includes a <b> Code playground, </b> that allows to write, run and test real C code!" +
            "\n Open the Code Playground. The hit run to see the output on the screen")

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var title: TextView = itemView.findViewById(R.id.title_viewpaper)
        var content: TextView = itemView.findViewById(R.id.content_viewpaper)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.viewpaper_content_item, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return titles.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.title.text = titles[position]
        holder.content.text = contents[position]
    }
}