package Speed

fun main(){
    val deers = arrayListOf<RainDeer>()
    deers.add(RainDeer("pavel",12,12,90))
    deers.add(RainDeer("karel",2,1,12))
    deers.add(RainDeer("racecar",20,9,102))
    deers.add(RainDeer("snad nepotrebuju nacitat ten input z aoc",9,14,85))
    deers.add(RainDeer("ja chci aby meli jmena :(",9,14,85))
    deers.add(RainDeer("vroom",3,200,150))


    for (i in 0..500){
        for (deer in deers)
            deer.update()
    }
    var firstDeer = deers[0]

    for (deer in deers)
        if (deer.distance > firstDeer.distance)
            firstDeer = deer

    println("Zavod vyhral ${firstDeer.name} se vzdalenosti ${firstDeer.distance}.")
}

