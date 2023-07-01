package com.example.projectofinalmcm_ipg

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class ProductAdapter (private val mList: List<Products>):RecyclerView.Adapter<ProductAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.product_card,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return mList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       val product = mList[position]

        holder.textView.setText(product.title)
        holder.textViewCategory.setText(product.category)
        holder.textviewPrice.setText((product.price).toString())
        //holder.textViewstock.setText((product.stock).toString())
        Picasso.get().load(product.images.get(0)).into(holder.imageView)
    }

    class ViewHolder(ItemView: View): RecyclerView.ViewHolder(ItemView) {

        val imageView: ImageView = ItemView.findViewById(R.id.imageview)
        val textView: TextView = ItemView.findViewById(R.id.textview)
        val textViewCategory: TextView = ItemView.findViewById(R.id.textviewCategoria)
        val textviewPrice: TextView = ItemView.findViewById(R.id.textviewPrice)
        //val textViewstock: TextView = ItemView.findViewById(R.id.textviewstock)

    }


}