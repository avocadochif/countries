package com.avocadochif.countries.extensions

import android.content.Context
import androidx.annotation.StringRes
import com.avocadochif.countries.entity.Country

@StringRes
fun Country.getCountryNameStringResId(context: Context): Int {
    return context.resources.getIdentifier(
        "country_name_${id.lowercase()}",
        "string",
        context.packageName
    )
}
