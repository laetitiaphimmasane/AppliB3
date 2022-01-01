package fr.epsi.studentapplication

import android.widget.TextView

open class StudentBaseActivity : BaseActivity() {
    fun setName(text:String){
        val textViewName = findViewById<TextView>(R.id.textViewName)
        textViewName.text=text
    }
}