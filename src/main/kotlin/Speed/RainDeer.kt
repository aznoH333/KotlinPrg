package Speed

class RainDeer(val name: String, val speed: Int, val flyingTime: Int, val restingTime: Int){
    var isMoving = true
    var timer = flyingTime
    var distance = 0

    fun update(){
        timer--;
        if (isMoving){
            distance += speed
        }

        if (timer <= 0){
            isMoving = !isMoving
            if (isMoving)     timer = flyingTime
            else              timer = restingTime
        }
    }

}