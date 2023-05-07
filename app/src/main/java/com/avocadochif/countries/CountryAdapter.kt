package com.avocadochif.countries

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.avocadochif.countries.databinding.ItemCountryBinding
import com.avocadochif.countries.entity.Country

class CountryAdapter : ListAdapter<Country, CountryViewHolder>(CountryDiffUtilItemCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        return CountryViewHolder(ItemCountryBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
        holder.bind(currentList[position])
    }

}