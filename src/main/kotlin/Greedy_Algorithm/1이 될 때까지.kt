package Greedy_Algorithm

fun main() {
    var n = readLine()!!.toInt()
    var k = readLine()!!.toInt()
    var result = 0

    while (true) {
        // N이 K로 나누어 떨어지는 수가 될 때까지 뺴기
        var target = (n / k) * k
        result += (n - target)
        n = target

        // N이 K보다 작을 때 (더 이상 나눌 수 없을 때) 반복문 탈출
        if (n < k) break

        // K로 나누기
        result += 1
        n /= k
    }

    // 마지막으로 남은 수에 대하여 1씩 빼기
    result += (n - 1)
    print(result)
}