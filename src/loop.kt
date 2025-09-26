fun main(){
    println("начинаем ритуал защиты")
    repeat(5){ index ->
        if (index == 2) {
            println("пропускаем шаг ${index +1} из-за магического вмешательства")
        return@repeat
        }
        println("заклинание защиты активировнано (шаг ${index +1}")
    }
    println("замок защищён")
}