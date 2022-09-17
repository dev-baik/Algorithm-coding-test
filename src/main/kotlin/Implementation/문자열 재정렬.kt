package Implementation

fun main() {
    var data = readLine()!!
    var result = arrayOf<String>()
    var value = 0

    for (x in data) {
        if (x.isDigit()) {
            value += x.digitToInt()
        } else {
            result = result.plus(x.toString())
        }
    }

    result.sort()
    if (value != 0) {
        result = result.plus(value.toString())
    }

    print(result.joinToString(""))
}