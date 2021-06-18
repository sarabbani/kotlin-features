package org.kotlin.features

import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals
import kotlin.test.assertNotSame
import kotlin.test.assertSame

internal class ProductTest {
    //    private val testProduct : Product = Product()
    @Test
    fun testProduct() {
        val p1 = Product("camera", 100.0)
        val p2 = Product("phone", 1950.50)
        val p3 = Product("camera", 100.0)
        assertNotEquals(p1, p2)
        assertEquals(p1,p3)
    }
}