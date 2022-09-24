package DFS

import java.util.*

fun main() {
    // 자바 라이브러리 활용할 경우
    var q = LinkedList<Int>()
    q.offer(5)
    q.offer(2)
    q.offer(3)
    q.offer(7)
    q.poll()
    q.offer(1)
    q.offer(4)
    q.poll()

    println(q.reversed())
    while(!q.isEmpty()) {
        print("${q.poll()} ")
    }
    println()


    // 코틀린에서는 큐와 스택을 기본 라이브러리로 제공 X
    var queue = arrayListOf<Int>()

    // py: queue.append(5)
    queue.add(5)
    queue.add(2)
    queue.add(3)
    queue.add(7)

    // queue.popleft()
    queue.removeAt(0)
    queue.add(1)
    queue.add(4)
    queue.removeAt(0)

    println(queue)
    queue.reverse()
    print(queue)
}
