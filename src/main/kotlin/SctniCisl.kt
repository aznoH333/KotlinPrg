package main.kotlin

fun main(){
    val input = readLine()?: return
    var output = 0

    for (ch in input){
        if (ch.isDigit())
            output += ch.digitToInt()
    }
    print(output)
}