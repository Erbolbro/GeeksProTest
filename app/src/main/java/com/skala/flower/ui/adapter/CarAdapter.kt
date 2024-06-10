package com.skala.flower.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.skala.flower.databinding.ItemCarBinding
import com.skala.flower.ui.model.CarModel

class CarAdapter(val onClick:OnClick) :
    RecyclerView.Adapter<CarAdapter.CarViewHolder>() {

    private var carList = mutableListOf<CarModel>()

    fun setCarList(carList: List<CarModel>) {
        this.carList = carList.toMutableList()
        notifyDataSetChanged()
    }

    inner class CarViewHolder(private val binding: ItemCarBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(car: CarModel) = with(binding) {
            Glide.with(ivCar.context)
                .load(car.image)
                .into(binding.ivCar)
            name.text = car.name
            year.text = car.year
        }

        init {
            binding.root.setOnClickListener {
                onClick.onClick(carList[adapterPosition])
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarViewHolder {
        val binding = ItemCarBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CarViewHolder(binding)
    }

    override fun getItemCount() = carList.size

    override fun onBindViewHolder(holder: CarViewHolder, position: Int) {
        holder.bind(carList[position])
    }
}