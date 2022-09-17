package Greedy_Algorithm

fun main() {
    var result = 0
    var n = readLine()!!.toInt()
    var data = IntArray(n)
    var count = 0

    for (i in 0 until n) {
        data[i] = readLine()!!.toInt()
    }

    data.sorted().map {
        count++
        if (count >= it) {
            result += 1
            count = 0
        }
    }
    print(result)
}