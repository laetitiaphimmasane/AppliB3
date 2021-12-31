package fr.epsi.studentapplication

// import com.squareup.picasso.Picasso
import android.content.Intent
import android.text.SpannableString
import android.text.Spanned.SPAN_INCLUSIVE_INCLUSIVE
import android.text.TextUtils
import android.text.style.AbsoluteSizeSpan
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TableRow
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class ProductAdapter(val products: ArrayList<Product>): RecyclerView.Adapter<ProductAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val product_table_row = view.findViewById<TableRow>(R.id.productRow)
        val productImageView = view.findViewById<ImageView>(R.id.productImage)
        val textViewInfos = view.findViewById<TextView>(R.id.productInfos)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.cell_product, viewGroup, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return products.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val product = products.get(position)

        val span1 = SpannableString("\n" + product.name)
        span1.setSpan(AbsoluteSizeSpan(16), 0, product.name.length+1, SPAN_INCLUSIVE_INCLUSIVE)

        val span2 = SpannableString("Description : " + product.description + "\n")
        span2.setSpan(AbsoluteSizeSpan(14), 0, product.description.length, SPAN_INCLUSIVE_INCLUSIVE)

        val finalText = TextUtils.concat(span1, "\n", span2)

        // Picasso.get().load(product.picture_url).into(holder.productImageView)
        holder.textViewInfos.text = finalText
        holder.product_table_row.setOnClickListener { v ->
            val intent = Intent(v.context, ProductDetails::class.java)
            intent.putExtra("name",product.name)
            intent.putExtra("description",product.description)
            intent.putExtra("picture_url",product.picture_url)
            v.context.startActivity(intent)
        }
    }
}