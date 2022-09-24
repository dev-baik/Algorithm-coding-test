package DFS

import java.util.Stack

fun main() {
    // 자바 라이브러리 활용할 경우
    var s = Stack<Int>()

    s.push(5)
    s.push(2)
    s.push(3)
    s.push(7)
    s.pop()
    s.push(1)
    s.push(4)
    s.pop()
    println(s.reversed())

    while(!s.empty()) {
        print("${s.peek()} ")
        s.pop()
    }
    println()

    // 코틀린에서는 큐와 스택을 기본 라이브러리로 제공 X
    var stack = arrayListOf<Int>()

    // py: stack.append(5)
    stack.add(5)
    stack.add(2)
    stack.add(3)
    stack.add(7)

    // py: stack.pop()
    stack.removeAt(stack.size-1)
    stack.add(1)
    stack.add(4)
    stack.removeAt(stack.size-1)

    // py: print(stack[::-1])
    println(stack.asReversed())
    print(stack)
}