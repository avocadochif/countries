package com.avocadochif.countries

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class CountryListViewModel : ViewModel() {

    private val _uiState = MutableStateFlow<CountryListUiState?>(null)
    val uiState: StateFlow<CountryListUiState?> get() = _uiState.asStateFlow()

    init {
        _uiState.value = CountryListUiState(
            countries = CountriesProvider
                .getCountries()
                .map { country ->
                    CountryListItemUiData(
                        flag = country.flag,
                        name = country.name,
                        phone = country.phone
                    )
                }
        )
    }

}