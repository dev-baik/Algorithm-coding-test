package BFS

fun bfs(graph: Array<Array<Int>>, start: Int, visited: ArrayList<Boolean>) {
    var queue = arrayListOf<Int>()
    queue.add(start)

    visited[start] = true

    while(queue.isNotEmpty()) {
        var v = queue.removeAt(0)
        print("$v ")

        for(i in graph[v]) {
            if (!visited[i]) {
                queue.add(i)
                visited[i] = true
            }
        }
    }
}

fun main() {
    // 각 노드가 연결된 정보를 표현 (2차원 리스트)
    val graph = arrayOf(
        arrayOf(),
        arrayOf(2, 3, 8),
        arrayOf(1, 7),
        arrayOf(1, 4, 5),
        arrayOf(3, 5),
        arrayOf(3, 4),
        arrayOf(7),
        arrayOf(2, 6, 8),
        arrayOf(1, 7)
    )

    var visited = arrayListOf<Boolean>()
    for(i in 0..9) {
        visited.add(false)
    }

    bfs(graph, 1, visited)
}