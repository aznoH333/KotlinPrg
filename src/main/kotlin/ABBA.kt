package main.kotlin

fun main(){
    val input = "ASSXXADASXASABBA"
    var ab = false
    var ba = false
    var bylobycoolkdybybylonecojakojenomfor = 0
    while(bylobycoolkdybybylonecojakojenomfor < input.length - 1){
        val segment = input.substring(bylobycoolkdybybylonecojakojenomfor, bylobycoolkdybybylonecojakojenomfor+2)
        when(segment){
            "AB" -> {
                ab = true
                bylobycoolkdybybylonecojakojenomfor++
            }
            "BA" -> {
                ba = true
                bylobycoolkdybybylonecojakojenomfor++
            }
        }

        bylobycoolkdybybylonecojakojenomfor++
    }
    print(ab && ba)
}