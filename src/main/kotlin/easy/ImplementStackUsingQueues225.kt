package easy

import java.util.LinkedList
import java.util.Queue

fun main() {

}
class MyStack() {
    var queue1 = LinkedList<Int>()
    var queue2 = LinkedList<Int>()
    fun push(x: Int) {
        while(queue1.isNotEmpty()){
            queue2.add(queue1.remove())
        }
        queue1.add(x)
        while(queue2.isNotEmpty()){
            queue1.add(queue2.remove())
        }
    }

    fun pop(): Int {
        return queue1.pop()
    }

    fun top(): Int {
        return queue1.peek()
    }

    fun empty(): Boolean {
        return queue1.isEmpty()
    }

}