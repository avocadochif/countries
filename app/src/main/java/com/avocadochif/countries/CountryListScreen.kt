package com.avocadochif.countries

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

data class CountryUiData(
    val flag: String,
    val name: String,
    val phone: String
)

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
    modifier: Modifier = Modifier
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
                    ListItem(
                        country = country,
                        modifier = Modifier.fillMaxWidth()
                    )
                }
            )
        }
    )
}

@Composable
private fun ListItem(
    country: CountryUiData,
    modifier: Modifier = Modifier,
) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically,
        content = {
            Text(
                text = country.flag,
                color = Color.Black,
                style = TextStyle.Default.copy(
                    fontSize = 24.sp
                )
            )
            Spacer(modifier = Modifier.width(8.dp))
            Column(
                modifier = Modifier.weight(1f),
                verticalArrangement = Arrangement.Center,
                content = {
                    Text(
                        text = country.name,
                        color = Color.Black,
                        style = TextStyle.Default.copy(
                            fontSize = 16.sp
                        )
                    )
                    Text(
                        text = country.phone,
                        color = Color.Black.copy(
                            alpha = 0.5f
                        ),
                        style = TextStyle.Default.copy(
                            fontSize = 14.sp
                        )
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