package Implementation

fun main() {
    var h = readLine()!!.toInt()
    var count = 0

    for (i in 0..h) {
        for (j in 0 until 60) {
            for (k in 0 until 60) {
                if (check(i, j, k)) count++
//                var str = (i.toString() + j.toString() + k.toString()).toCharArray()
//                if (str.contains('3')) {
//                    count++
//                }
            }
        }
    }
    print(count)
}

fun check(h: Int, m: Int, s: Int): Boolean {
    if (h % 10 == 3 || m / 10 == 3 || m % 10 == 3 || s / 10 == 3 || s % 10 == 3) return true
    return false
}