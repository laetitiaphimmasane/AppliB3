package fr.epsi.studentapplication


import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

open class BaseActivity : AppCompatActivity() {
    fun showBack(){
        val imageViewBack = findViewById<ImageView>(R.id.imageBack)
        imageViewBack.visibility= View.VISIBLE
        imageViewBack.setOnClickListener(View.OnClickListener {
            onBackPressed()
        })
    }

    fun setHeaderTitle(text:String){
        val textViewTitle = findViewById<TextView>(R.id.titleHeader)
        textViewTitle.text=text
    }

}