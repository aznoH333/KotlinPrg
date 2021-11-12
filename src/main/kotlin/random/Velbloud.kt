package random

import kotlin.math.abs
import kotlin.math.ceil

fun main(){
    val banany = mutableMapOf<Int, Int>()
    banany.put(0,3000)
    val v = velbloud()

    println("Velbloud v:b${ceil(Math.random() * 16) + 0.1} ready for action")
    while (true){
        val input = readLine()!!
        when(input[0]){
            'r' -> v.report(banany)
            't' -> v.takeBanany(banany)
            'd' -> v.dropBanany(banany, input.substring(1).toInt())
            'm' -> v.moveTo(input.substring(1).toInt())
            'e' -> break
        }
    }
    println("ok ima die")
    println("Velbloud died ,${banany.get(1000)} banany wher in the city")
}

class velbloud{
    var currentBanany = 0
    var currentDist = 0

    fun takeBanany(b: MutableMap<Int, Int>){
        val takenAmmount = if(b.get(currentDist)!! < 1000 - currentBanany) b.get(currentDist) else 1000 - currentBanany
        b.set(currentDist, b.get(currentDist)!! - takenAmmount!!)
        currentBanany += takenAmmount
    }

    fun dropBanany(b: MutableMap<Int, Int>, ammount: Int){
        if (b.containsKey(currentDist))
            b[currentDist] = b[currentDist]!! + ammount
        else
            b.put(currentDist, ammount)
        currentBanany-=ammount
    }

    fun moveTo(dist: Int){
        currentBanany -= abs(currentDist - dist)
        currentDist = dist
    }

    fun report(b: MutableMap<Int, Int>){
        println("Current banany   = $currentBanany")
        println("Current position = $currentDist")
        if (b.containsKey(currentDist))
            println("Banany on ground = ${b.get(currentDist)}")
    }
}
