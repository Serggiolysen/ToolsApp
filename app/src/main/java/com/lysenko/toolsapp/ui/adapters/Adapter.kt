package com.lysenko.toolsapp.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.lysenko.toolsapp.R
import com.lysenko.toolsapp.remote.models.MachineToolApi
import java.util.*

interface ItemClickHandler {
    fun onItemClick(item: MachineToolApi)
}

class Adapter : RecyclerView.Adapter<Adapter.ViewHolder>() {

    private val machinesList: MutableList<MachineToolApi> = LinkedList()
    private var itemClickHandler: ItemClickHandler? = null


    fun setData(list: List<MachineToolApi>) {
        machinesList.clear()
        machinesList.addAll(list)
        notifyDataSetChanged()
    }

    fun attachClickHandler(itemClickHandler1: ItemClickHandler) {
        this.itemClickHandler = itemClickHandler1
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            itemView = LayoutInflater.from(parent.context).inflate(
                R.layout.machine_cell,
                parent, false
            ), itemClickHandler1 = itemClickHandler
        )
    }

    override fun getItemCount(): Int {
        return machinesList.count()
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(model = machinesList[position])

    }

    inner class ViewHolder(
        itemView: View, private val itemClickHandler1: ItemClickHandler?
    ) :
        RecyclerView.ViewHolder(itemView) {
        private val imageView: ImageView = itemView.findViewById(R.id.imageMacine)
        private val textview: TextView = itemView.findViewById(R.id.macineTitle)
        private val progressBar: ProgressBar = itemView.findViewById(R.id.progressBar)


        fun bind(model: MachineToolApi) {
            imageView.setOnClickListener {
                itemClickHandler1?.onItemClick(item = model)
            }

            progressBar.visibility = View.VISIBLE

            Glide.with(itemView.context)
                .load(model.video1)
                .fitCenter()
                .into(imageView)

            textview.text = model.model

            progressBar.visibility = View.GONE

        }
    }
}