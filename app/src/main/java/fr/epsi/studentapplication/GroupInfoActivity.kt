package fr.epsi.studentapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class GroupInfoActivity :BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_group_info)
        setHeaderTitle("Infos")
        showBack()
    }
}