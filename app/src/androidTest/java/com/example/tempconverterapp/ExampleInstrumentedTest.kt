package com.example.tempconverterapp

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith
import org.junit.Assert.*

@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    /* Test untuk memastikan context nama package benar */
    @Test
    fun useAppContext() {
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.example.tempconverterapp", appContext.packageName)
    }

    /* Dummy test: memastikan runtime test bisa berjalan */
    @Test
    fun dummyInstrumentTest() {
        val status = true
        assertTrue(status)
    }
}
