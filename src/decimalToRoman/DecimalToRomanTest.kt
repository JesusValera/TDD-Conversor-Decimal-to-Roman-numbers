package decimalToRoman

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class DecimalToRomanTest {

    val decimalToRoman = DecimalToRoman()

    @Test
    fun convertOne() {
        assertEquals("I", decimalToRoman.convert(1))
    }

    @Test
    fun convertTwo() {
        assertEquals("II", decimalToRoman.convert(2))
    }

    @Test
    fun convertThree() {
        assertEquals("III", decimalToRoman.convert(3))
    }

}
