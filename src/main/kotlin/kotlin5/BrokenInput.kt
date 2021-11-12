package kotlin5

import kotlin.math.ceil

fun main(){
    val inputs = mutableListOf<String>()
    // get input
    while (true){
        val input = readLine()
        if (input == "END" || input == null)
            break
        inputs.add(input)
    }
    // fix input
    var sum = 0
    for (i in inputs.indices){
        sum += inputs[i].toIntOrNull() ?:
        fixInput(inputs.subList(if (i-2 >= 0) i-2 else 0, if (i+2 <= inputs.size) i+2 else inputs.size))
    }
    // print
    println(sum/inputs.size)
}

// fixes input based on surrounding numbers
fun fixInput(input: MutableList<String>): Int{
    var output = 0
    for (i in input){
        output += i.toIntOrNull() ?: 0
    }
    return ceil(output.toDouble()/input.size).toInt()
}