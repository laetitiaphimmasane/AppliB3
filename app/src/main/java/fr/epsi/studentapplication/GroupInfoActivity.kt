package fr.epsi.studentapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class GroupInfoActivity :BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_group_info)
        setHeaderTitle("Infos")
        showBack()
        val buttonRodica = findViewById<Button>(R.id.buttonRodica)
        val buttonLaetitia = findViewById<Button>(R.id.buttonLaetitia)

        val textViewName = findViewById<TextView>(R.id.textViewName)

        buttonRodica.setOnClickListener(View.OnClickListener {
            val newIntent = Intent(application,StudentActivity::class.java)
            startActivity(newIntent)
        })

        buttonLaetitia.setOnClickListener(View.OnClickListener {
            val newIntent = Intent(application,StudentActivity::class.java)
            startActivity(newIntent)
        })
    }
}

