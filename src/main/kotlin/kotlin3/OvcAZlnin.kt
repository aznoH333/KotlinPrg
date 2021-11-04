package kotlin3

fun main(){
    val col = mutableMapOf<String, Type>()
    val validTypes = arrayOf(Type.Ovoce, Type.Zelenina)

    for (t in validTypes){
        println("Zadej pocet $t :")
        var i = readLine()!!.toInt()
        while (i > 0){
            val temp = readLine()!!
            if (!col.containsKey(temp) ){
                col.put(temp,t)
                i--
            }else
                println("Chyba $temp uz existuje")
        }
    }

    while (true){
        println("Zadej hledany nazev")
        val input = readLine()!!
        if(col.containsKey(input))
            println("$input je ${col.get(input)}")
        else
            println("$input je ${Type.Ostatni}")
    }
}

enum class Type{
    Ovoce, Zelenina, Ostatni
}
