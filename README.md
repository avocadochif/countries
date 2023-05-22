# Countries

[![](https://jitpack.io/v/avocadochif/countries.svg)](https://jitpack.io/#avocadochif/countries)

##### Android library provides essential country information such as country code, dial code, country name, and flag emoji.

## How to integrate into your app?

1. Add the JitPack repository to your `settings.gradle` file:

```
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        maven { url "https://jitpack.io" }
    }
}
```

2. Add implementation of library to your app `build.gradle` file:

```
implementation 'com.github.avocadochif:countries:x.x.x'
```

## Usage

1. Use `CountriesProvider` for get list with countries:

```kotlin
CountriesProvider.getCountries()
```

2. How to get country name with translation (please note, this extension return `@StringRes`):

```kotlin
country.getCountryNameStringResId(<use_context_here>)
```

## Country fields
The Country entity contains next fields:

| Field name | Description |
| :---------- | :---------- |
| id | County id, based on ISO 3166-1 alpha3 |
| name | Country name(English by default), based on ISO 3166-1 |
| flag | Unicode emoji for represent country flag |
| phone | Dial code, based on E.164 |
| pattern | Phone number format, please note that it's optional and can be `null` |

## Languages & Locales
Library is ready to use with different locales. It use information from this [repository](https://github.com/stefangabos/world_countries) for translation. 
Please note, for support different locales you need to use `getCountryNameStringResId()` extension. We support next `locales` and `languages`:

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

Copyright (c) 2023 Stepan Revytskyi

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
