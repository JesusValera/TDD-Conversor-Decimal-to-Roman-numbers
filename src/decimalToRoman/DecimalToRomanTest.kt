package decimalToRoman

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import kotlin.test.assertEquals

class DecimalToRomanTest {

    private val decimalToRoman = DecimalToRoman()

    @Test
    fun lessToZero() {
        assertThrows<DecimalToRoman.NegativeNumber> { decimalToRoman.convert(-1) }
    }

    @Test
    fun equalToZero() {
        assertEquals("", decimalToRoman.convert(0))
    }

    @Test
    fun convertOneToTen() {
        assertEquals("I", decimalToRoman.convert(1))
        assertEquals("II", decimalToRoman.convert(2))
        assertEquals("III", decimalToRoman.convert(3))
        assertEquals("IV", decimalToRoman.convert(4))
        assertEquals("V", decimalToRoman.convert(5))
        assertEquals("VI", decimalToRoman.convert(6))
        assertEquals("VII", decimalToRoman.convert(7))
        assertEquals("VIII", decimalToRoman.convert(8))
        assertEquals("IX", decimalToRoman.convert(9))
        assertEquals("X", decimalToRoman.convert(10))
    }

    @Test
    fun convertTenToOneHundred() {
        assertEquals("XX", decimalToRoman.convert(20))
        assertEquals("XXIII", decimalToRoman.convert(23))
        assertEquals("XXIV", decimalToRoman.convert(24))
        assertEquals("XXXIX", decimalToRoman.convert(39))
        assertEquals("XL", decimalToRoman.convert(40))
        assertEquals("L", decimalToRoman.convert(50))
        assertEquals("LXXX", decimalToRoman.convert(80))
        assertEquals("XC", decimalToRoman.convert(90))
        assertEquals("C", decimalToRoman.convert(100))
    }

}
