package fr.epsi.studentapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telecom.Call
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
// import okhttp3.*
import org.json.JSONObject
import java.io.IOException

class RayonsListActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rayons_list)
        setHeaderTitle("Rayons")
        showBack()

        val rayons = arrayListOf<Rayon>()

        /*val recyclerView = findViewById<RecyclerView>(R.id.recyclerViewRayons)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val rayonAdapter = RayonAdapter(rayons)
        recyclerView.adapter = rayonAdapter

        val okHttpClient: OkHttpClient = OkHttpClient.Builder().build()
        val mRequestURL="http://djemam.com/epsi/categories.json"
        val request = Request.Builder()
            .url(mRequestURL)
            .get()
            .cacheControl(CacheControl.FORCE_NETWORK)
            .build()

        okHttpClient.newCall(request).enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {
                TODO("Not yet implemented")
            }

            override fun onResponse(call: Call, response: Response) {
                val data = response.body?.string()

                if(data!=null){
                   val jsRayons = JSONObject(data)
                    val jsArrayRayons= jsRayons.getJSONArray("items")
                    for(i in 0 until jsArrayRayons.length()){
                        val jsRayon = jsArrayRayons.getJSONObject(i)
                        val rayon = Rayon(jsRayon.optString("category_id",""),
                            jsRayon.optString("title",""),
                            jsRayon.optString("products_url",""))
                        // rayons.add(rayon)
                        // Log.d("rayon",rayon.name)
                    }
                    Log.d("Rayon","${rayons.size}")
                    runOnUiThread(Runnable {
                        // studentAdapter.notifyDataSetChanged()
                    })
                }
            }

        })*/
    }
}