package com.example.recyclerviewhomework1.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewhomework1.R
import com.example.recyclerviewhomework1.model.ItemPerson
import kotlinx.android.synthetic.main.item_number.view.*
import java.util.zip.Inflater

class ItemPersonAdapter(var personList: ArrayList<ItemPerson>) :
    RecyclerView.Adapter<ItemPersonAdapter.ItemPersonViewHolder>() {
        inner class ItemPersonViewHolder(itemView: View):
        RecyclerView.ViewHolder(itemView){

        fun BindPerson(person : ItemPerson){
            itemView.txtLike.text = person.like
            itemView.txtComment.text = person.comment
            itemView.txtShare.text = person.share

        }

        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
            ItemPersonViewHolder {
        var view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_number,parent,false)
        return ItemPersonViewHolder(view)
    }

    override fun getItemCount(): Int {
        return personList.size
    }

    override fun onBindViewHolder(holder: ItemPersonViewHolder, position: Int) {
        holder.BindPerson(personList[position])
    }
}