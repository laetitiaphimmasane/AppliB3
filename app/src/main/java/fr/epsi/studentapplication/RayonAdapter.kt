package fr.epsi.studentapplication

import android.os.Bundle
import android.util.Log
/*import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
// import com.squareup.picasso.Picasso

class RayonAdapter(val rayons: ArrayList<Rayon>):RecyclerView.Adapter<ViewHolder>() {

    class ViewHolder(view:View) :RecyclerView.ViewHolder(view){
        val textViewTitle = view.findViewById<TextView>(R.id.textViewTitle)
        val contentLayout = view.findViewById<LinearLayout>(R.id.contentLayout)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.cell_rayon, viewGroup, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val rayon = rayons.get(position)
        holder.textViewTitle.text=rayon.title
        holder.contentLayout.setOnClickListener(View.OnClickListener {
            holder.contentLayout.context.applicationContext as AppEpsi
        })
    }

    override fun getItemCount(): Int {
        return rayons.size
    }

    override fun onBindViewHolder(holder: RayonAdapter.ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}*/