package main.kotlin.kotlin1

fun main(){
    var input = readLine()
    var xd = true
    var njmnsi = 0
    var njvci = 0
    while(input != "end"){
        val bruh = input?.toInt()
        if (bruh != null){
            if (xd) {
                njmnsi = bruh
                njvci = bruh
                xd = false
            }
            else{
                if (njmnsi > bruh) njmnsi = bruh
                if (njvci  < bruh) njvci = bruh
            }
        }
        input = readLine()
    }
    println(njmnsi)
    println(njvci)
}