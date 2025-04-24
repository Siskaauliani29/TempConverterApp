package com.example.tempconverterapp

import org.junit.Assert.*
import org.junit.Test

class TemperatureConverterTest {

    /* Test case konversi 0°C = 32°F */
    @Test
    fun testCelsiusToFahrenheit() {
        val converter = TemperatureConverter()
        val result = converter.celsiusToFahrenheit(0.0)
        assertEquals(32.0, result, 0.001)
    }

    /* Test case konversi 212°F = 100°C */
    @Test
    fun testFahrenheitToCelsius() {
        val converter = TemperatureConverter()
        val result = converter.fahrenheitToCelsius(212.0)
        assertEquals(100.0, result, 0.001)
    }
}
