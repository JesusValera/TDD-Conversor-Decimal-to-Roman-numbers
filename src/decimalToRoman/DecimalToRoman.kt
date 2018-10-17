package decimalToRoman

class DecimalToRoman {

    fun convert(number: Int): String {

        var result: String = ""

        for (i in 0 until number) {
            result += "I"
        }

        return result
    }

}
