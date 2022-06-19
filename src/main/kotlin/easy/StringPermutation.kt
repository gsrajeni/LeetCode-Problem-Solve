package easy

fun main() {
    println(permutations("abcd",""))
}

fun permutations(str:String, storedString: String): List<String>{
    val permuteList = mutableListOf<String>()
    if(str.length == 1){
        permuteList.add(storedString + str)
        return permuteList
    }
    else
        for(i in str.indices)
            permuteList.addAll(permutations(str.removeRange(i,i+1),storedString+str[i]))
    return permuteList}