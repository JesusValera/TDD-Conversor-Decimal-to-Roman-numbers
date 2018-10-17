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

}
