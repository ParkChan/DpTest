package com.example.dptest

import android.util.TypedValue
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView

class DpTestAdapter(diffCallback: DiffUtil.ItemCallback<String>) : ListAdapter<String, DpTestAdapter.DpTestHolder>(diffCallback) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DpTestHolder {
        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_text_dp, parent, false)
        return DpTestHolder(view)
    }

    override fun onBindViewHolder(holder: DpTestHolder, position: Int) {
        holder.init(position)
    }

    inner class DpTestHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val tvContent: TextView = itemView.findViewById(R.id.tv_item_text_dp)

        fun init(pos: Int) {
            tvContent.text = itemView.context.getString(R.string.item_string_dp_content, pos + 1)
            tvContent.setTextSize(TypedValue.COMPLEX_UNIT_DIP, (pos + 1).toFloat())
        }

    }
}
