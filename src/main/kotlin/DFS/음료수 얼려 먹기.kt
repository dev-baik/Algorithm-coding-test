package DFS

fun main() {
    var n = readLine()!!.toInt()
    var m = readLine()!!.toInt()

    var graph = Array(n) { IntArray(m) { 0 } }

    for(i in 0 until n) {
        var str = readLine()!!
        for (j in 0 until m) {
            graph[i][j] = str[j].toString().toInt()
        }
    }

    fun dfs(x: Int, y: Int): Boolean {
        if(x <= -1 || x >= n || y <= -1 || y >= m)
            return false

        if(graph[x][y] == 0) {
            graph[x][y] = 1
            dfs(x - 1, y)
            dfs(x, y - 1)
            dfs(x + 1, y)
            dfs(x, y + 1)
            return true
        }
        return false
    }

    var result = 0
    for(i in 0 until n) {
        for(j in 0 until m) {
            if(dfs(i, j)) {
                result += 1
            }
        }
    }

    print(result)
}