package easy

import java.util.Stack

fun main() {
    val queue = MyQueue()
    queue.push(1)
    queue.push(2)
    queue.peek()
    queue.pop()
    queue.empty()
}
class MyQueue() {
    private val firstStack = Stack<Int>()
    private val secondStack = Stack<Int>()

    fun push(x: Int) {
        secondStack.push(x)
        firstStack.forEach {
            secondStack.push(it)
        }
        firstStack.clear()
        secondStack.forEach {
            firstStack.push(it)
        }
        secondStack.clear()
    }

    fun pop(): Int {
        firstStack.forEach{
            secondStack.push(it)
        }
        firstStack.clear()
        val pop = secondStack.pop()
        secondStack.forEach {
            firstStack.push(it)
        }
        secondStack.clear()
        secondStack.clear()
        return pop
    }

    fun peek(): Int {
        return firstStack.last()
    }

    fun empty(): Boolean {
        return firstStack.size == 0
    }

}