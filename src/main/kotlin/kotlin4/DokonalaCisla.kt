package kotlin4

fun main(){
    for(i in 1..readLine()!!.toInt()) if (isNice(i)) println(i)
}

fun isNice(a: Int): Boolean{
    val d = mutableListOf<Int>()
    for (i in 1..a/2) if (a%i == 0) d.add(i)
    return d.sum() == a

}