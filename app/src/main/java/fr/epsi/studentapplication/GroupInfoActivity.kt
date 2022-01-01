package fr.epsi.studentapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import java.util.*

class GroupInfoActivity :StudentBaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_group_info)
        setHeaderTitle("Infos")
        showBack()
        val buttonRodica = findViewById<Button>(R.id.buttonRodica)
        val buttonLaetitia = findViewById<Button>(R.id.buttonLaetitia)
        val LinkedListRodica = LinkedList<String>()
        val LinkedListLaetitia = LinkedList<String>()

        LinkedListRodica.addAll(listOf("Rodica", "rodica.adigbonon@epsi.fr", "Groupe 1", "https://i.pinimg.com/564x/e9/a3/e7/e9a3e7d6739f21aad1a5469cdb26d4d1.jpg"))
        LinkedListLaetitia.addAll(listOf("Laetitia","laetitia.phimmasane@epsi.fr","Groupe 1", "https://i.pinimg.com/564x/64/6c/2f/646c2fc907ce2790a6f3cb3f652c63bc.jpg"))

        buttonRodica.setOnClickListener(View.OnClickListener {
            val newIntent = Intent(application,StudentActivity::class.java);
            newIntent.putExtra("Liste", LinkedListRodica)
            startActivity(newIntent)
        })

        buttonLaetitia.setOnClickListener(View.OnClickListener {
            val newIntent = Intent(application,StudentActivity::class.java);
            newIntent.putExtra("Liste", LinkedListLaetitia)
            startActivity(newIntent)
        })

    }
}

