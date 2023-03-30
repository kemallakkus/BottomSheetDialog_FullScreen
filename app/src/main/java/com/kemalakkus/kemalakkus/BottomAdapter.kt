package com.kemalakkus.kemalakkus

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kemalakkus.kemalakkus.databinding.ChoiceItemBinding

class BottomAdapter(val list: ArrayList<Choices>) : RecyclerView.Adapter<BottomAdapter.BottomViewHolder>() {
    var isEnable = false
    val itemSelectedList = mutableListOf<Int>()

    class BottomViewHolder(val binding: ChoiceItemBinding) : RecyclerView.ViewHolder(binding.root)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BottomViewHolder {
        val view = ChoiceItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return BottomViewHolder(view)
    }

    override fun onBindViewHolder(holder: BottomViewHolder, position: Int) {

        val choices = list[position]


        holder.binding.apply {
            textChoice.text = choices.text

            holder.itemView.setOnClickListener {
                if (isEnable) {
                    onClickItem?.let {
                        it.invoke(true)
                    }
                    if (choices.isSelected) {
                        choices.isSelected = false
                        holder.itemView.setBackgroundResource(R.drawable.item_background)
                        itemSelectedList.remove(position)

                    } else {
                        choices.isSelected = true
                        holder.itemView.setBackgroundResource(R.drawable.item_select_background)
                        itemSelectedList.add(position)
                    }
                } else {
                    onClickItem?.let {
                        it.invoke(true)
                    }
                    selectedItem(holder, choices, position)
                    holder.itemView.setBackgroundResource(R.drawable.item_select_background)
                }
                if (itemSelectedList.isEmpty()){
                    onClickItem?.let {
                        it.invoke(false)
                    }
                }

            }
        }
    }


    var onClickItem:((Boolean) -> Unit)? = null

        override fun getItemCount(): Int {
            return list.size
        }

        private fun selectedItem(holder: BottomViewHolder, choices: Choices, position: Int) {
            isEnable = true
            itemSelectedList.add(position)
            choices.isSelected = true
        }
    }
