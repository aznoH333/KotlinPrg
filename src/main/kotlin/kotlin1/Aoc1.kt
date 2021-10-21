package main.kotlin.kotlin1

import java.io.File

fun main(){
    val str = File("src/main/kotlin/inputAoc1.txt").readText()
    var output = 0
    for (i in 0 until str.length)
        output += if (str[i] == '(') 1 else -1
    println(output)
}