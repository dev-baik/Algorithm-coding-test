package Greedy

fun main() {
    var data = readLine()!!
    var result = 0

    for(i in data) {
//        var num = i - '0'
        var num = i.digitToInt()
        if (num <= 1 || result <= 1) {
            result += num
        } else {
            result *= num
        }
    }
    print(result)
}