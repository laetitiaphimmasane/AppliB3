package fr.epsi.studentapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonZone2 = findViewById<Button>(R.id.button_zone2)

        buttonZone2.setOnClickListener(View.OnClickListener {
            val newIntent = Intent(application,RayonsListActivity::class.java)
            startActivity(newIntent)
        })

        setHeaderTitle("Main")
        (application as AppEpsi)
    }
}