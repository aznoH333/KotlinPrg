package main.kotlin.kotlin1

fun main(){
    var muzes = false
    var output = 0

    while(true){
        var input = readLine()?.toInt()
        if (input != null) if (muzes && input%3 == 0)  output+= input
        muzes=!muzes

        println(output)
    }
}