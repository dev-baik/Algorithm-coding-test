package BFS

fun main() {
    var n = readLine()!!.toInt()
    var m = readLine()!!.toInt()

    var graph = Array(n) { IntArray(m) }

    for(i in 0 until n) {
        var str = readLine()!!
        for(j in 0 until m) {
            graph[i][j] = str[j].digitToInt()
        }
    }

    var dx = intArrayOf(-1, 1, 0, 0)
    var dy = intArrayOf(0, 0, -1, 1)

    fun bfs(x: Int, y: Int): Boolean {
        var q = arrayListOf<Pair<Int, Int>>()
        q.add(Pair(x, y))
        graph[x][y] = 1

        while(q.isNotEmpty()) {
            var x = q[0].first
            var y = q[0].second

            q.removeAt(0)

            for(i in 0..3) {
                var nx = x + dx[i]
                var ny = y + dy[i]

                if(nx < 0 || nx >= n || ny < 0 || ny >= m) continue

                if(graph[nx][ny] == 0) {
                    graph[nx][ny] = 1
                    q.add(Pair(nx, ny))
                }
            }
        }
        return true
    }

    var result = 0
    for(i in 0 until n) {
        for(j in 0 until m) {
            if (graph[i][j] == 0) {
                if (bfs(i, j)) {
                    result += 1
                }
            }
        }
    }
    print(result)
}