package kotlin2

import java.io.File
import java.math.RoundingMode

fun main(){
    val input = File("src/main/kotlin/kotlin2/cnb.txt").readLines()
    for (i in input){
        val b = i.split("|")
        println((b[2].toDouble()/b[4].replace(",",".").toDouble()).toBigDecimal().setScale(4, RoundingMode.CEILING).toString() + " ${b[3]} = 1CZK")
    }
}