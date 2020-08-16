package com.earetech.application.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.earetech.application.R
import com.earetech.application.models.ResponseUsers
import kotlinx.android.synthetic.main.list_user.view.*


class UserAdapter(val data: List<ResponseUsers>?): RecyclerView.Adapter<UserAdapter.MyHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        val value = LayoutInflater.from(parent.context).inflate(R.layout.list_user, parent, false)
        return MyHolder(value)
    }

    override fun getItemCount(): Int = data?.size ?: 0

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        holder.bind(data?.get(position))
    }

    class MyHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        fun bind(get: ResponseUsers?) {
            itemView.name.text = get?.name
        }
    }
}