package com.avocadochif.countries.entity

data class Country(
    val id: String,         // ISO 3166-1 alpha-3
    val name: String,       // ISO 3166-1
    val flag: String,       // unicode emoji
    val phone: String,      // E.164
    val pattern: String?,   // number format
)
