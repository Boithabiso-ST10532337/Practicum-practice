#  Weather Report App (Android - Kotlin)

## Project Overview
This is a simple Android application built using **Kotlin** that displays a weekly weather report. The app stores weather data in a 2D array and formats it into a readable layout shown on the screen.

---

## Features
- Displays a full weekly weather report
- Shows:
  - Day of the week
  - Minimum temperature
  - Maximum temperature
  - Weather conditions
- Clean formatted output using line-by-line structure
- Simple navigation buttons:
  - Navigate to detailed screen
  - Exit application

---

## Concepts Used
- Kotlin Arrays (2D arrays)
- Loops (`for` loop with `until`)
- StringBuilder for efficient string formatting
- Android TextView display
- Button click listeners
- Intents for screen navigation

---

## Data Structure
The weather data is stored in a 2D array:

```kotlin
val weather = arrayOf(
    arrayOf("Day:", "Minimum:", "Maximum:", "Weather Condition:"),
    arrayOf("Monday", "8", "22", "Partly cloudy with mostly sunny conditions."),
    arrayOf("Tuesday", "8", "19", "Sunny but windy."),
    arrayOf("Wednesday", "7", "18", "Sunny but windy."),
    arrayOf("Thursday", "7", "22", "Cloudy but low wind."),
    arrayOf("Friday", "9", "23", "Clear skies."),
    arrayOf("Saturday", "9", "19", "Windy but sunny."),
    arrayOf("Sunday", "7", "21", "Mild and cloudy.")
)
