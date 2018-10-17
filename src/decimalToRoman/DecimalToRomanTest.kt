package decimalToRoman

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import kotlin.test.assertEquals
import kotlin.test.assertTrue

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

}
