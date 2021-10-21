package kotlin2

fun main(){
    var input = readLine()!!.toInt()
    val money = arrayOf(5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1)
    var output = 0

    for(b in money){
        while (input >= b){
            input -= b
            output++
        }
    }
    println(output)
}