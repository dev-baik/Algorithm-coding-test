package Implementation

fun main() {
    var n = readLine()!!.toInt()
    var x = 1
    var y = 1

    var plans = readLine()!!.toCharArray()

    var dx = intArrayOf(-1, 1, 0, 0)
    var dy = intArrayOf(0, 0, -1, 1)
    var move_types = arrayOf('L', 'R', 'U', 'D')

    var nx = 0
    var ny = 0

    for (plan in plans) {
        for (i in move_types.indices) {
            if(plan == move_types[i]) {
                nx = x + dx[i]
                ny = y + dy[i]
            }
        }
        if (nx < 1 || ny < 1 || nx > n || ny > n) continue

        x = nx
        y = ny
    }

    println("$x, $y")
}