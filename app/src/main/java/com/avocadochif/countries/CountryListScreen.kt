package com.avocadochif.countries

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

val countries = CountriesProvider
    .getCountries()
    .map { country ->
        CountryUiData(
            flag = country.flag,
            name = country.name,
            phone = country.phone
        )
    }

@Composable
fun CountryListScreen(
    modifier: Modifier = Modifier,
) {
    val countries = remember { countries }

    LazyColumn(
        modifier = modifier,
        state = rememberLazyListState(),
        contentPadding = PaddingValues(
            horizontal = 16.dp,
            vertical = 8.dp
        ),
        verticalArrangement = Arrangement.spacedBy(space = 8.dp),
        content = {
            items(
                items = countries,
                itemContent = { country ->
                    CountryListItem(
                        country = country,
                        modifier = Modifier.fillMaxWidth()
                    )
                }
            )
        }
    )
}

@Preview
@Composable
private fun CountryListScreenPreview() {
    CountryListScreen(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
            .statusBarsPadding()
            .navigationBarsPadding()
    )
}