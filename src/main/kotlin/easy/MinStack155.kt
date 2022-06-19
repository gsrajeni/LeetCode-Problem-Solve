package easy

import java.util.Stack
import kotlin.math.min

fun main() {
    val minStack = MinStack()
    minStack.push(-2)
    minStack.push(0)
    minStack.push(-3)
    val p1 = minStack.getMin()
    minStack.pop()
    val p2 = minStack.top()
    val p3 = minStack.getMin()
    print("$p1 $p2 $p3")
}
class MinStack() {
    val stack = Stack<Int>()
    fun push(`val`: Int) {
        stack.push(`val`)
    }

    fun pop() {
        stack.pop()
    }

    fun top(): Int {
       return stack.last()
    }

    fun getMin(): Int {
        return stack.sorted().first()
    }

}