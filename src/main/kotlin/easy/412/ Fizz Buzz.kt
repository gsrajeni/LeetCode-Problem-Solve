package easy.`412`

fun main() {
 print(fizzBuzz(15))
}
fun fizzBuzz(n: Int): List<String> {
val ansList = mutableListOf<String>()
 for (i in 1 .. n){
  var fizbuzz = ""
  if(i % 3 == 0) fizbuzz += "Fizz"
  if(i % 5 == 0) fizbuzz += "Buzz"
  if(i % 3 != 0 && i % 5 != 0) fizbuzz = i.toString()
  ansList.add(fizbuzz)
 }
 return ansList
}