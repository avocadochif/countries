package com.avocadochif.countries

import kotlinx.collections.immutable.ImmutableList

data class CountryListUiState(
    val countries: ImmutableList<CountryListItemUiData>
)