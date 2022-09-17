package Implementation

fun main() {
    var input_data = readLine()
    var row = input_data!![1].toString().toInt()
    var column = input_data[0].toInt() - 'a'.toInt() + 1

//    var dx = intArrayOf(-2, -1, 1, 2, 2, 1, -1, -2)
//    var dy = intArrayOf(-1, -2, -2, -1, 1, 2, 2, 1)
    var steps = arrayOf(
        arrayOf(-2, -1), arrayOf(-1, -2),
        arrayOf(1, -2), arrayOf(2, -1),
        arrayOf(2, 1), arrayOf(1, 2),
        arrayOf(-1, 2), arrayOf(-2, 11))

    var result = 0

    for (step in steps) {
        var next_row = row + step[0]
        var next_column = column + step[1]

        if (next_row in 1..8 && next_column in 1..8) {
            result++
        }
    }
    print(result)
}