package easy

import java.util.Stack

val openParenthesis = listOf('(', '{', '[')
val closeParenthesis = listOf(')', '}', ']')
val parenthesisMap = mapOf<Char, Char>(
    ')' to '(',
    '}' to '{',
    ']' to '['
)

fun main() {
    print(isValid(")"))
}

fun isValid(s: String): Boolean {
    val stack = Stack<Char>()
    var valid = true
    run{
        s.forEach {
            if (openParenthesis.contains(it)) {
                if (stack.isEmpty()) stack.add(it)
                else if (openParenthesis.contains(stack.peek()) || stack.peek() == null) {
                    stack.push(it)
                } else {
                    valid = false
                    return@run
                }
            } else {
                if(stack.isEmpty()){
                    valid = false
                    return@run
                }
                val openForThis = parenthesisMap[it]
                if(stack.peek() != openForThis){
                    valid = false
                    return@run
                }
                if (stack.peek() == openForThis) {
                    stack.pop()
                }
            }
        }
    }

    if (valid)
        valid = stack.isEmpty()
    return valid
}