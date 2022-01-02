package fr.epsi.studentapplication

import android.net.Uri
import android.net.Uri.parse
import android.widget.ImageView
import android.widget.TextView
import java.net.URI

open class StudentBaseActivity:BaseActivity() {
    fun setName(text:String){
        val textViewTitle = findViewById<TextView>(R.id.textViewName)
        textViewTitle.text=text
    }

    fun setEmail(text:String){
        val textViewEmail = findViewById<TextView>(R.id.textViewEmail)
        textViewEmail.text = text
    }

    fun setGroup(text:String){
        val textViewGroup = findViewById<TextView>(R.id.textViewGroup)
        textViewGroup.text = text
    }

    fun setImageView(id:String){
        val imageViewStudent = findViewById<ImageView>(R.id.imageViewStudent)
        if (id=="rodica"){
            imageViewStudent.setImageResource(R.drawable.icon_rodica)
        } else if(id =="laetitia"){
            imageViewStudent.setImageResource(R.drawable.icon_laetitia)
        }
    }
}