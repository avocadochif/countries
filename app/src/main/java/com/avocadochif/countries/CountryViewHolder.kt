package com.avocadochif.countries

import androidx.recyclerview.widget.RecyclerView
import com.avocadochif.countries.databinding.ItemCountryBinding
import com.avocadochif.countries.entity.Country

class CountryViewHolder(
    private val binding: ItemCountryBinding
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(country: Country) {
        binding.flagTV.text = country.flag
        binding.nameTV.text = country.name
        binding.phoneTV.text = country.phone
    }

}