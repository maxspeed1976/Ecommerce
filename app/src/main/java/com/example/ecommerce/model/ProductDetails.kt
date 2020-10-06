package com.example.ecommerce.model

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ecommerce.R
import kotlinx.android.synthetic.main.product_details.*

class ProductDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.product_details)
        var intent = intent.getStringExtra("title")
        descr.text = intent

    }
}