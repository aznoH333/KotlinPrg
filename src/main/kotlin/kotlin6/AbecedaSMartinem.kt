package kotlin6

fun main(){
    println("zdj pct slv")
    val words = Array(readLine()!!.toInt()){
        println("zdj slvo")
        readLine()!!
    }
    val samohlasky = arrayOf('a','e','i','y','o','u')

    //map words
    val wordMap = mutableListOf<Pair<Int,String>>()
    for(i in words){
        wordMap.add(Pair(i.asSequence().filter { c -> samohlasky.contains(c) }.count(),i))
    }

    //word search
    while(true){
        println("zdj pct smhlsk")
        val input = readLine()!!.toIntOrNull()
        if (input == null){
            break
        }else{
            for (i in wordMap){
                if (i.first == input)
                    println(i.second)
            }
        }
    }
}