package com.avocadochif.countries

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CountryListItem(
    country: CountryListItemUiData,
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
                    fontSize = 24.sp,
                ),
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
                            fontSize = 16.sp,
                        ),
                    )
                    Text(
                        text = country.phone,
                        color = Color.Black.copy(
                            alpha = 0.5f,
                        ),
                        style = TextStyle.Default.copy(
                            fontSize = 14.sp,
                        ),
                    )
                }
            )
        }
    )
}

@Preview(showBackground = true)
@Composable
private fun CountryListItemPreview() {
    val country = CountriesProvider
        .getCountries()
        .first()
        .let { country ->
            CountryListItemUiData(
                flag = country.flag,
                name = country.name,
                phone = country.phone
            )
        }

    CountryListItem(
        country = country,
        modifier = Modifier.fillMaxWidth()
    )
}