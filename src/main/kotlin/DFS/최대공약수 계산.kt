package DFS

fun gcd(a: Int, b: Int): Int {
    if (a % b == 0)
        return b
    else
        return gcd(b, a % b)
}

fun main() {
    print(gcd(192, 162))
}