package kotlin4

fun main(){
    for(i in 2..readLine()!!.toInt()) if (isPrime(i)) println(i)
}

fun isPrime(a: Int): Boolean{
    for (i in 2..a/2) if (a%i == 0) return false
    return true
}