package kotlin4

import kotlin.math.pow

fun main(){
    for(i in 0..readLine()!!.toInt()) if (isStrong(i)) println(i)
}

fun isStrong(a: Int): Boolean{
    val j = mutableListOf<Int>()
    for(i in a.toString())
        j.add(i.digitToInt().toDouble().pow((a.toString().length)).toInt())
    return a==j.sum()
}