package kotlin3

fun main(){
    var input = mutableListOf<Int>()
    while (true){
        val inp = readLine()
        if (!inp.equals("end")) input.add(inp!!.toInt())
        else break
    }
    val average = input.sum()/input.size
    var out = 0
    for (i in input) if(i > average) out+=i
    println(out)
}

