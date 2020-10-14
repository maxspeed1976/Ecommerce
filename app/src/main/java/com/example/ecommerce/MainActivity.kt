package com.example.ecommerce

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ecommerce.model.Product
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*
import kotlinx.android.synthetic.main.main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


            val products = arrayListOf<Product>()
            for (i in 1..100){

                products.add(Product("Organic Apple #$i","https://via.placeholder.com/250/aabbff/cccccc",1.99))
            }

        recycler_view.apply {
            layoutManager = GridLayoutManager ( this@MainActivity ,2)

            adapter = ProductsAdapter(products)
        }
    }
}