package decimalToRoman

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import kotlin.test.assertEquals

class DecimalToRomanTest {

    private val decimalToRoman = DecimalToRoman()

    @Test
    fun lessThanZero() {
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

    @Test
    fun convertOneHundredToOneThousandAndSoOn() {
        assertEquals("CC", decimalToRoman.convert(200))
        assertEquals("CD", decimalToRoman.convert(400))
        assertEquals("D", decimalToRoman.convert(500))
        assertEquals("DC", decimalToRoman.convert(600))
        assertEquals("DCCC", decimalToRoman.convert(800))
        assertEquals("CM", decimalToRoman.convert(900))
        assertEquals("M", decimalToRoman.convert(1000))
        assertEquals("MM", decimalToRoman.convert(2000))
    }

    @Test
    fun lessThanZeroRecursive() {
        assertThrows<DecimalToRoman.NegativeNumber> { decimalToRoman.convertRecursive(-1) }
    }

    @Test
    fun equalToZeroRecursive() {
        assertEquals("", decimalToRoman.convertRecursive(0))
    }

    @Test
    fun convertOneToTenRecursive() {
        assertEquals("I", decimalToRoman.convertRecursive(1))
        assertEquals("II", decimalToRoman.convertRecursive(2))
        assertEquals("III", decimalToRoman.convertRecursive(3))
        assertEquals("IV", decimalToRoman.convertRecursive(4))
        assertEquals("V", decimalToRoman.convertRecursive(5))
        assertEquals("VI", decimalToRoman.convertRecursive(6))
        assertEquals("VII", decimalToRoman.convertRecursive(7))
        assertEquals("VIII", decimalToRoman.convertRecursive(8))
        assertEquals("IX", decimalToRoman.convertRecursive(9))
        assertEquals("X", decimalToRoman.convertRecursive(10))
    }

    @Test
    fun convertTenToOneHundredRecursive() {
        assertEquals("XX", decimalToRoman.convertRecursive(20))
        assertEquals("XXIII", decimalToRoman.convertRecursive(23))
        assertEquals("XXIV", decimalToRoman.convertRecursive(24))
        assertEquals("XXXIX", decimalToRoman.convertRecursive(39))
        assertEquals("XL", decimalToRoman.convertRecursive(40))
        assertEquals("L", decimalToRoman.convertRecursive(50))
        assertEquals("LXXX", decimalToRoman.convertRecursive(80))
        assertEquals("XC", decimalToRoman.convertRecursive(90))
        assertEquals("C", decimalToRoman.convertRecursive(100))
    }

    @Test
    fun convertOneHundredToOneThousandAndSoOnRecursive() {
        assertEquals("CC", decimalToRoman.convertRecursive(200))
        assertEquals("CD", decimalToRoman.convertRecursive(400))
        assertEquals("D", decimalToRoman.convertRecursive(500))
        assertEquals("DC", decimalToRoman.convertRecursive(600))
        assertEquals("DCCC", decimalToRoman.convertRecursive(800))
        assertEquals("CM", decimalToRoman.convertRecursive(900))
        assertEquals("M", decimalToRoman.convertRecursive(1000))
        assertEquals("MM", decimalToRoman.convertRecursive(2000))
    }

}
