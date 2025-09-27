fun main(){
    println("вы находитесь на уровне 0. Ваша цель - уровень 5")
    var lvl = 0
    while (lvl <= 5) {
        println("Выбрать действие: идти вперёд (1), осмотреться (2) или сдаться (0)")
        var player = readln().toInt()
        if (player == 0) {
            println("game over")
            break
        }
        else if (player == 1){
            lvl++
            println("вы на уровне $lvl")
            println("Выбрать действие: идти вперёд (1), осмотреться (2) или сдаться (0)")
        }
        else if (player==2){
            println("вы осмотрелись. пройдено шагов: ${lvl}")
            continue
        }
        else if (lvl == 5){
            println("celebrate!")
            break
        }
        else {println("not found")}
        continue
    }

}