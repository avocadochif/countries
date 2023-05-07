package com.avocadochif.countries

import androidx.recyclerview.widget.DiffUtil
import com.avocadochif.countries.entity.Country

class CountryDiffUtilItemCallback : DiffUtil.ItemCallback<Country>() {

    override fun areItemsTheSame(oldItem: Country, newItem: Country): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Country, newItem: Country): Boolean {
        return oldItem == newItem
    }

}