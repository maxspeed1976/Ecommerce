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
        val view = LayoutInflater.from (parent.context).inflate(R.layout.product_row,parent,false)

        view.setOnClickListener{
            val intent = Intent(parent.context, ProductDetails:: class.java )
            val holder = ViewHolder(view)
          //  Log.d("OLEG",products[holder.adapterPosition].title)

            intent.putExtra("title","Oleg")


            parent.context.startActivity(intent)

        }

        return ViewHolder(view)
    }


    override fun getItemCount(): Int = products.size


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.title.text = products[position].title
        Picasso.get().load(products[position].photoUrl).into(holder.image)
        holder.price.text = products[position].price.toString()




    }

    class ViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){
        val image: ImageView = itemView.image
        val title = itemView.title
        val price = itemView.price





    }


}
