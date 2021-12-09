package fr.epsi.studentapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonZoneUn = findViewById<Button>(R.id.buttonZoneUn)
        val buttonZoneDeux = findViewById<Button>(R.id.buttonZoneDeux)

        buttonZoneUn.setOnClickListener(View.OnClickListener {
            val newIntent = Intent(application,GroupInfoActivity::class.java)
            startActivity(newIntent)
        })

        setHeaderTitle("Epsi")
    }
}