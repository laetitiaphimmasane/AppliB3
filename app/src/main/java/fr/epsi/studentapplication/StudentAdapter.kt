package fr.epsi.studentapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

import fr.epsi.studentapplication.StudentAdapter.ViewHolder

class StudentAdapter(val students: ArrayList<Student>):RecyclerView.Adapter<ViewHolder>() {

    class ViewHolder(view:View) :RecyclerView.ViewHolder(view){
        val textViewName = view.findViewById<TextView>(R.id.textViewName)
        val textViewEmail = view.findViewById<TextView>(R.id.textViewEmail)
        val textViewGroup = view.findViewById<TextView>(R.id.textViewGroup)
        val imageViewStudent = view.findViewById<ImageView>(R.id.imageViewStudent)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.activity_student, viewGroup, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val student = students.get(position)
        holder.textViewName.text=student.name
        holder.textViewEmail.text=student.email
        holder.textViewGroup.text=student.groupe
    }

    override fun getItemCount(): Int {
        return students.size
    }
}