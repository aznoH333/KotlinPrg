package main.kotlin

import kotlin.math.ceil

fun main() {
    val dylka = 10.0
    val vyska = 10.0
    val velykost = 4.0
    println(ceil(dylka / velykost) * ceil(vyska / velykost))
}
