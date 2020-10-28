package com.mat.linkthis

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_link.view.*

class ListDataAdapter(val items: Array<DataExplorer>) : RecyclerView.Adapter<ListDataAdapter.ViewHolder>() {
    class ViewHolder(view : View, private val context: Context) : RecyclerView.ViewHolder(view) {
        fun bindItem(dataExplorer: DataExplorer){
            with(dataExplorer){
                itemView.title_item.text = getTitleData()
                itemView.desc_item.text = getDescData()
                itemView.img_item.setImageDrawable(getDrawable())
                if(this is LinkData){
                    itemView.link_item.text = "$link"
                    itemView.setOnClickListener {
                        if(link != null) {
                            val intent = Intent(Intent.ACTION_VIEW)
                            intent.data = Uri.parse(link)
                            startActivity(context, intent, null)
                        }
                    }
                }else{
                    itemView.link_item.text = ""
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val lineView = LayoutInflater.from(parent.context).inflate(R.layout.item_link,parent,false)
        return ViewHolder(lineView,parent.context)
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(items[position])
    }
}