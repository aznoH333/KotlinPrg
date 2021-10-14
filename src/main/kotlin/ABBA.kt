package main.kotlin

fun main(){
    val input = "ASSXXADASXASABBA"
    var ab = false
    var ba = false
    var bylobycoolkdybybylonecojakojenomfor = 0
    while(bylobycoolkdybybylonecojakojenomfor < input.length - 1){
        val segment = input.substring(bylobycoolkdybybylonecojakojenomfor, bylobycoolkdybybylonecojakojenomfor+2)
        if (segment =="AB"){
            ab = true
            bylobycoolkdybybylonecojakojenomfor++
        }
        else if (segment =="BA"){
            ba = true
            bylobycoolkdybybylonecojakojenomfor++
        }

        bylobycoolkdybybylonecojakojenomfor++
    }
    print(ab && ba)
}