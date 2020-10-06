package com.example.ecommerce

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ecommerce.model.Product
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            val products = arrayListOf<Product>()
            for (i in 0..100){

                products.add(Product("Organic Apple","http://via.placeholder.com/350/aabbff/cccccc",1.99))
            }

        recycler_view.apply {
            layoutManager = LinearLayoutManager ( this@MainActivity )
            adapter = ProductsAdapter(products)
        }
    }
}