fun main() {
    println(solution(7263))
}
fun solution(X: Int): String{
    val weeks = X / 604800
    val days = (X % 604800) / 86400
    val hours = ((X % 604800) % 86400) / 3600
    val minutes = (((X % 604800) % 86400) % 3600) / 60
    val seconds = (((X % 604800) % 86400) % 3600) % 60
    var representString = ""
    var counter = 0;
    if(weeks != 0){
        counter++
        representString = representString + "${weeks}w"
    }
    if(counter < 2 && days != 0){
        counter++
        if(counter == 2 && hours != 0) representString += "${days + 1}d"
        representString += "${days}d"
    }
    if(counter < 2 && hours != 0){
        counter++
        representString = representString + "${hours}h"
    }
    if(counter < 2 && minutes != 0){
        counter++
        representString = representString + "${minutes}m"
    }
    if(counter < 2 && seconds != 0){
        counter++
        representString = representString + "${seconds}w"
    }
    return representString
}