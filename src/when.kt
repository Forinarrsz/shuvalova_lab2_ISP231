fun main() {
    val number = readln().toInt()
    var month = when (number) {
        1 -> month = "январь"
        2 -> month = "февраль"
        3 -> month = "март"
        4 -> month = "апрель"
        5 -> month = "май"
        6 -> month = "июнь"
        7 -> month = "июль"
        8 -> month = "август"
        9 -> month = "сентябрь"
        10 -> month = "октябрь"
        11 -> month = "ноябрь"
        12 -> month = "декабрь"
        else -> "нет соответствующего номера"
    }
}
//
//         if (number in 1..12){
//             println("Вы ввели номер $number, это месяц - $month")
//         }
}