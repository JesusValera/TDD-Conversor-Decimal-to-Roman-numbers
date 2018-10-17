package decimalToRoman

import java.lang.RuntimeException

class DecimalToRoman {

    private var result: String = ""

    fun convert(_number: Int): String {
        var number = _number
        result = ""

        if (number < 0) throw NegativeNumber()

        number = subtractAmount(100, number, "C")
        number = subtractAmount(90, number, "XC")
        number = subtractAmount(50, number, "L")
        number = subtractAmount(40, number, "XL")
        number = subtractAmount(10, number, "X")
        number = subtractAmount(9, number, "IX")
        number = subtractAmount(5, number, "V")
        number = subtractAmount(4, number, "IV")
        subtractAmount(1, number, "I")

        return result
    }

    private fun subtractAmount(subtract: Int, _number: Int, romanNumber: String): Int {
        var number = _number

        while (number >= subtract) {
            number -= subtract
            result += romanNumber
        }

        return number
    }

    class NegativeNumber : RuntimeException()
}
