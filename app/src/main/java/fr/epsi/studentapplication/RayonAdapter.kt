package fr.epsi.studentapplication

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TableLayout
import android.widget.TableRow
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RayonAdapter(val rayons: ArrayList<Rayon>):RecyclerView.Adapter<RayonAdapter.ViewHolder>() {

    class ViewHolder(view: View) :RecyclerView.ViewHolder(view){
        val categories_table_row = view.findViewById<TableRow>(R.id.categorieRow)
        val textViewTitle = view.findViewById<TextView>(R.id.categorieTitle)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.cell_rayon, viewGroup, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return rayons.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val rayon = rayons.get(position)
        holder.textViewTitle.text = "\n" + rayon.title + "\n"
        holder.categories_table_row.setOnClickListener { v ->
            val intent = Intent(v.context, ProductsList::class.java)
            intent.putExtra("title",rayon.title)
            intent.putExtra("products_url",rayon.products_url)
            v.context.startActivity(intent)
        }
    }
}