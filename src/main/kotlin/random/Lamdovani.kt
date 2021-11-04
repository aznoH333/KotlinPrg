package kotlin3

fun main() {
    mutableListOf<Int>().also {input -> readLine().also{ inp -> if (!inp.equals("end")) input.add(inp!!.toInt()) }
    (input.sum() / input.size).also { average -> println(input.filter { it > average }.sum()) }}
}