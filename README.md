# Countries

[![](https://jitpack.io/v/avocadochif/countries.svg)](https://jitpack.io/#avocadochif/countries)
![Weekly download statistics](https://jitpack.io/v/avocadochif/countries/week.svg)
![Monthly download statistics](https://jitpack.io/v/avocadochif/countries/month.svg)

**Countries** is an Android library that provides essential information about countries, including country code, dial code, country name, and flag emoji. It supports multiple locales for internationalized country names.

## Installation

To add the **Countries** library to your Android project:

1. Add the JitPack repository to your `settings.gradle` file:

```
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        maven { url "https://jitpack.io" }
    }
}
```

2. Include the library dependency in your `build.gradle` file:

```
implementation 'com.github.avocadochif:countries:x.x.x'
```

Replace `x.x.x` with the latest version. Check [here](https://github.com/avocadochif/countries/releases) for the latest release.

## Usage

### Get List of Countries

Use `CountriesProvider` to retrieve the list of available countries:

```kotlin
CountriesProvider.getCountries()
```

### Get Localized Country Name

To get a localized country name, use the `getCountryNameStringResId()` extension (note: it returns a `@StringRes`):

```kotlin
country.getCountryNameStringResId(<use_context_here>)
```

## Country fields

Each Country entity includes the following fields:

| Field name | Description |
| :---------- | :---------- |
| id | Country ID based on ISO 3166-1 alpha-3 code. |
| name | Country name (in English by default), based on ISO 3166-1. |
| flag | Unicode emoji representing the country's flag. |
| phone | Dial code, based on E.164. |
| pattern | Optional phone number format pattern (can be `null`). |

## Supported Languages & Locales

**Countries** supports multiple locales for country name translations. Translations are sourced from this [repository](https://github.com/stefangabos/world_countries). To access localized country names, use the `getCountryNameStringResId()` extension. We support next `locales` and `languages`:

| Locale | Language |
| :---------- | :---------- |
| ar | Arabic |
| bg | Bulgarian |
| cs | Czech |
| da | Danish |
| de | German |
| el | Greek |
| eo | Esperanto |
| es | Spanish |
| et | Estonian |
| eu | Basque |
| fi | Finnish |
| fr | French |
| hr | Croatian |
| hu | Hungarian |
| hy | Armenian |
| it | Italian |
| ja | Japanese |
| ko | Korean |
| lt | Lithuanian |
| nl | Dutch |
| no | Norwegian |
| pl | Polish |
| pt | Portuguese |
| ro | Romanian |
| ru | russian |
| sk | Slovak |
| sl | Slovenian |
| sr | Serbian |
| sv | Swedish |
| th | Thai |
| uk | Ukrainian |
| zh | Chinese |
| zh-tw | Traditional Chinese |

## License

```MIT License

Copyright (c) 2025 Stepan Revytskyi

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```
