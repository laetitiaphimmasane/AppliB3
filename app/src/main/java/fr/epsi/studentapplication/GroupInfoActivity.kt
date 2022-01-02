package fr.epsi.studentapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import java.io.Serializable
import java.util.*

class GroupInfoActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_group_info)
        setHeaderTitle("Infos sur les étudiants")
        showBack()
        val buttonRodica = findViewById<Button>(R.id.buttonRodica)
        val buttonLaetitia = findViewById<Button>(R.id.buttonLaetitia)

        buttonRodica.setOnClickListener(View.OnClickListener {
            val localIntent = Intent(application, StudentActivity::class.java)
            localIntent.putExtra("name", "Rodica Adigbonon")
            localIntent.putExtra("email", "rodica.adigbonon@epsi.fr")
            localIntent.putExtra("groupe","Groupe 1")
            localIntent.putExtra("image","rodica")
            startActivity(localIntent)
        })

        buttonLaetitia.setOnClickListener(View.OnClickListener {
            val localIntent = Intent(application, StudentActivity::class.java)
            localIntent.putExtra("name", "Laëtitia Phimmasane")
            localIntent.putExtra("email", "laetitia.phimmasane@epsi.fr")
            localIntent.putExtra("groupe","Groupe 1")
            localIntent.putExtra("image","laetitia")
            startActivity(localIntent)
        })
    }
}

