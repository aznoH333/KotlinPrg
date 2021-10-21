package kotlin2

import java.io.File

fun main(){
    val input = File("src/main/kotlin/kotlin2/aoc2.txt").readLines()
    var processedInput = Array(input.size){Array(3){0} }
    for (i in input.indices){
        val bruh = input[i].split("x")
        for (j in 0..2)
            processedInput[i][j] = bruh[j].toInt()
    }
    var totalAmount = 0
    var totalRibbon = 0
    for (l in processedInput){
        val width: Int = l[0]
        val height: Int = l[1]
        val length: Int = l[2]



        totalAmount += 2 * length * width + 2 * width * height + 2 * length * height + width * length * height / Math.max(
            Math.max(width, height), length
        )

        val nejmensi = Math.min(width, Math.min(height, length))
        val nejmensejsi = pogrom(width, height, length)
        totalRibbon += nejmensi + nejmensi + nejmensejsi + nejmensejsi + width * height * length
    }
    println("Total Amount : $totalAmount")
    println("Total Ribbon : $totalRibbon")
}

fun pogrom(width: Int, height: Int, length: Int): Int{
    val pogrm = arrayOf(width, height, length)
    pogrm.sort()
    return pogrm[1]
}