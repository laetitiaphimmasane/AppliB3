package fr.epsi.studentapplication

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
// import com.squareup.picasso.Picasso

class ProductDetails : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_details)

        val name = intent.getStringExtra("name")
        val description = intent.getStringExtra("description")
        val picture_url = intent.getStringExtra("picture_url")
        val productImageView = findViewById<ImageView>(R.id.product_details_image)
        val textViewInfos = findViewById<TextView>(R.id.product_details_description)

        if (name != null) {
            setHeaderTitle(name)
        } else {
            setHeaderTitle("Produit")
        }
        showBack()

        textViewInfos.text = "Description : " + "\n" + description

        // Picasso.get().load(picture_url).into(productImageView)

        // (application as StudentApplication)
    }
}