package DFS

fun dfs(graph: Array<Array<Int>>, v: Int, visited: ArrayList<Boolean>) {
    // 현재 노드를 방문 처리
    visited[v] = true
    print("$v ")

    // 현재 노드와 연결된 다른 노드를 재귀적으로 방문
    for(i in graph[v]) {
        if (!visited[i]) {
            dfs(graph, i, visited)
        }
    }
}

fun main() {
    // 각 노드가 연결된 정보를 표현 (2차원 리스트)
    var graph = arrayOf(
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

    dfs(graph, 1, visited)
}