package kotlin3

fun main(){
    val c = arrayListOf<Int>()
    var unique = 0
    while (true){
        val input = readLine()!!
        if (input.toIntOrNull() != null){
            if (!c.contains(input.toInt())) unique++
            c.add(input.toInt())
        } else break
    }
    println(unique)
    println(c)
}
