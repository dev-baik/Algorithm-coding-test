package Greedy

fun main() {
    var n = readLine()!!.toInt()

    // 큰 단위의 화폐부터 차례대로 확인하기
    var array = intArrayOf(500, 100, 50, 10)
    var count = 0

    for(coin in array) {
        // 해당 화폐로 거슬러 줄 수 있는 동전의 개수 세기
       count += n / coin
       n %= coin
    }
    print(count)
}