package main.kotlin.kotlin1

val xSize = 8
val ySize = 8

fun main(){
    var zivot = List(xSize) {MutableList(ySize){false} }
    //add lidi
    zivot[2][2] = true
    zivot[2][3] = true
    zivot[2][4] = true

    //game loop
    for(i in 0..5){
        update(zivot)
        draw(zivot)
    }

}

fun draw(zivot: List<List<Boolean>>) {
    for (lidi in zivot) {
        for (clovek in lidi)
            print(if(clovek) "X" else " ")
        print("\n")
    }
}

fun update(zivot: List<MutableList<Boolean>>) {
    val temp = zivot.toList()

    for (x in temp.indices)
        for (y in temp[x].indices)
            when (getNeighbors(temp,x,y)){
                0,1,4 ->    zivot[x][y] = false
                3 ->        zivot[x][y] = true
            }
}

fun getNeighbors(temp: List<MutableList<Boolean>>, x: Int, y: Int): Int {
    var output = 0
    if (x > 0 && temp[x-1][y]) output++
    if (x < xSize -1 && temp[x+1][y]) output++
    if (y > 0 && temp[x][y-1]) output++
    if (y < ySize -1 && temp[x][y+1]) output++
    if (y > 0 && temp[x][y+1]) output++

    return output
}
