package decimalToRoman

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class DecimalToRomanTest {

    private val decimalToRoman = DecimalToRoman()

    @Test
    fun convertOneToTen() {
        assertEquals("I", decimalToRoman.convert(1))
        assertEquals("II", decimalToRoman.convert(2))
        assertEquals("III", decimalToRoman.convert(3))
        assertEquals("IV", decimalToRoman.convert(4))
        assertEquals("V", decimalToRoman.convert(5))
    }

}
