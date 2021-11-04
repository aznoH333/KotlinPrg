package random

import kotlin.math.abs

fun main(){
    val banany = mutableMapOf<Float, Float>()
    banany.put(0f,1000f)
    val v = velbloud()

    println("Velbloud v:b15 ready for action")
    while (true){
        val input = readLine()!!
        when(input[0]){
            'r' -> v.report(banany)
            't' -> v.takeBanany(banany)
            'd' -> v.dropBanany(banany, input.substring(1).toFloat())
            'm' -> v.moveTo(input.substring(1).toFloat())
            'e' -> break
        }
    }
}

class velbloud{
    var currentBanany = 0f
    var currentDist = 0f

    fun takeBanany(b: MutableMap<Float, Float>){
        val takenAmmount = if(b.get(currentDist)!! < 1000 - currentBanany) b.get(currentDist) else 1000 - currentBanany
        b.set(currentDist, b.get(currentDist)!! - takenAmmount!!)
        currentBanany += takenAmmount
    }

    fun dropBanany(b: MutableMap<Float, Float>, ammount: Float){
        b.put(currentBanany, ammount)
        currentBanany-=ammount
    }

    fun moveTo(dist: Float){
        currentBanany -= abs(currentDist - dist)
        currentDist = dist
    }

    fun report(b: MutableMap<Float, Float>){
        println("Current banany   = $currentBanany")
        println("Current position = $currentDist")
        if (b.containsKey(currentDist))
            println("Banany on ground = ${b.get(currentDist)}")
    }
}
