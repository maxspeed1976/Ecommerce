package com.example.ecommerce

import android.content.Context
import android.content.Intent
import android.icu.number.NumberFormatter.with
import android.icu.number.NumberRangeFormatter.with
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.ecommerce.model.Product
import com.example.ecommerce.model.ProductDetails
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.product_row.view.*
import java.util.ArrayList

class ProductsAdapter (private val products: ArrayList<Product>): RecyclerView.Adapter<ProductsAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from (parent.context).inflate(R.layout.product_row,parent,false)
        val holder = ViewHolder(view)
        view.setOnClickListener{
            val intent = Intent(parent.context, ProductDetails:: class.java )

            intent.putExtra("title",products[holder.adapterPosition].title)
            parent.context.startActivity(intent)
        }

        return holder
    }


    override fun getItemCount(): Int = products.size
    class ViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){
        val image: ImageView = itemView.image
        val title: TextView = itemView.title
        val price: TextView = itemView.price





    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.title.text = products[position].title
        Picasso.get().load(products[position].photoUrl).into(holder.image)
        holder.price.text = products[position].price.toString()




    }




}
