package kotlin3

import java.io.File

fun main(){
    val c = mutableMapOf<String,Double>();
    val rawInput = File("src/main/kotlin/kotlin2/cnb.txt").readLines()
    for (i in rawInput){
        val j = i.split("|")
        c.put(j[3],j[4].replace(",",".").toDouble()/j[2].toDouble())
    }
    while(true){
        val i = Array(3){ readLine()!!}
        if(!c.containsKey(i[1]) || !c.containsKey(i[2]) || i[0].toIntOrNull() == null) println("bye")
        else println("${i[0]} ${i[1]} = ${i[0].toInt()* c.get(i[1])!!/c.get(i[2])!!} ${i[2]}")
    }

}