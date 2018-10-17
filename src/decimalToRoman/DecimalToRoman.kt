package decimalToRoman

import java.lang.RuntimeException

class DecimalToRoman {

    private var result: String = ""

    fun convertRecursive(number: Int, result: String = ""): String = when {
        (0 > number) -> throw NegativeNumber()
        (1000 <= number) -> convertRecursive(number - 1000, result + "M")
        (900 <= number) -> convertRecursive(number - 900, result + "CM")
        (500 <= number) -> convertRecursive(number - 500, result + "D")
        (400 <= number) -> convertRecursive(number - 400, result + "CD")
        (100 <= number) -> convertRecursive(number - 100, result + "C")
        (90 <= number) -> convertRecursive(number - 90, result + "XC")
        (50 <= number) -> convertRecursive(number - 50, result + "L")
        (40 <= number) -> convertRecursive(number - 40, result + "XL")
        (10 <= number) -> convertRecursive(number - 10, result + "X")
        (9 <= number) -> convertRecursive(number - 9, result + "IX")
        (5 <= number) -> convertRecursive(number - 5, result + "V")
        (4 <= number) -> convertRecursive(number - 4, result + "IV")
        (1 <= number) -> convertRecursive(number - 1, result + "I")
        else -> result
    }

    fun convert(_number: Int): String {
        var number = _number // val cannot be reassigned.
        formatResult()

        isNegativeNumber(number)

        number = subtractAmount(1000, number, "M")
        number = subtractAmount(900, number, "CM")
        number = subtractAmount(500, number, "D")
        number = subtractAmount(400, number, "CD")
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

    private fun formatResult() {
        result = ""
    }

    private fun isNegativeNumber(number: Int) {
        if (0 > number) throw NegativeNumber()
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
