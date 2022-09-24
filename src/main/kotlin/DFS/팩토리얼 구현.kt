package DFS

// 반복적으로 구현한 n!
fun factorial_iteratvie(n: Int): Int {
    var result = 1

    for (i in 1..n) {
        result *= i
    }
    return result
}

// 재귀적으로 구현한 n!
fun factorial_recursive(n: Int): Int {
    if(n <= 1)
        return 1

    return n * factorial_recursive(n-1)
}

fun main() {
    println("반복적으로 구현: ${factorial_iteratvie(5)}")
    println("재귀적으로 구현: ${factorial_recursive(5)}")
}