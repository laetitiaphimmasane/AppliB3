package fr.epsi.studentapplication

import android.net.Uri
import android.os.Bundle
import android.util.Log
import java.util.*


class StudentActivity : StudentBaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student)

        val name = intent.getStringExtra("name")
        val email = intent.getStringExtra("email")
        val groupe = intent.getStringExtra("groupe")
        val image = intent.getStringExtra("image")
        setName(name.toString())
        setEmail(email.toString())
        setGroup(groupe.toString())
        setImageView(image.toString())
        setHeaderTitle("Fiche de "+ name.toString())
        showBack()
    }
}