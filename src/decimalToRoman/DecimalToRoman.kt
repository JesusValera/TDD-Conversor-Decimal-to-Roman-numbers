package decimalToRoman

import java.lang.RuntimeException

class DecimalToRoman {

    private var result: String = ""

    fun convert(_number: Int): String {
        var number = _number
        result = ""

        if (number < 0) throw NegativeNumber()

        if (10 <= number) {
            result += "X"
            number -= 10
        }

        if (9 == number) {
            result += "IX"
            return result
        }

        if (5 <= number) {
            result += "V"
            number -= 5
        }

        if (4 == number) {
            result += "IV"
            return result
        }

        for (i in 0 until number) {
            result += "I"
        }

        return result
    }

    class NegativeNumber : RuntimeException()
}
