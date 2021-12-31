package fr.epsi.studentapplication

import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import okhttp3.*
import org.json.JSONObject
import java.io.IOException

class ProductsList : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products_list)

        val title = intent.getStringExtra("title")
        val products_url = intent.getStringExtra("products_url")

        if (title != null) {
            setHeaderTitle(title)
        } else {
            setHeaderTitle("Rayon")
        }
        showBack()

        if(products_url !== null){
            Log.d("products_url", products_url)
            val products = arrayListOf<Product>()

            val recyclerView = findViewById<RecyclerView>(R.id.recyclerViewProducts)
            recyclerView.layoutManager = LinearLayoutManager(this)
            val productAdapter = ProductAdapter(products)
            recyclerView.adapter = productAdapter

            val okHttpClient: OkHttpClient = OkHttpClient.Builder().build()
            val mRequestURL= products_url
            val request = Request.Builder()
                .url(mRequestURL)
                .get()
                .cacheControl(CacheControl.FORCE_NETWORK)
                .build()

            okHttpClient.newCall(request).enqueue(object : Callback {

                override fun onFailure(call: Call, e: IOException) {
                    Log.d("err","Erreur")
                }

                override fun onResponse(call: Call, response: Response) {
                    val data = response.body?.string()

                    if(data!=null){
                        val jsProducts = JSONObject(data)
                        val jsArrayProducts = jsProducts.getJSONArray("items")
                        for(i in 0 until jsArrayProducts.length()){
                            val jsProduct = jsArrayProducts.getJSONObject(i)
                            val product = Product(jsProduct.optString("name",""),
                                jsProduct.optString("description",""),
                                jsProduct.optString("picture_url",""))
                            products.add(product)
                            Log.d("product",product.name)
                        }
                        Log.d("Product","${products.size}")
                        runOnUiThread(Runnable {
                            productAdapter.notifyDataSetChanged()
                        })
                    }
                }

            })
        } else {
            Log.d("err", "url null")
        }
    }
}