# Countries

[![](https://jitpack.io/v/avocadochif/countries.svg)](https://jitpack.io/#avocadochif/countries)

##### Android library provides essential country information such as country code, dial code, country name, and flag emoji.

## How to integrate into your app?

1. Add the JitPack repository to your `settings.gradle` file:

```
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
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
