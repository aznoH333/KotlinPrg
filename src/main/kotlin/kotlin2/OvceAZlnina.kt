package kotlin2

fun main(){
    println("Zadej zeleninu")
    val zelenina = Array(readLine()!!.toInt()){ readLine()}
    println("Zadej ovoce")
    val ovoce = Array(readLine()!!.toInt()){ readLine()}
    while (true){
        readLine().also {
            when{
                it == "end"     -> return
                it in zelenina  -> println("zelenina")
                it in ovoce     -> println("ovoce")
                else            -> println("ostatni")
            }
        }
    }
}