fun main(){
    //лабораторная работа
    println("hello,world")
    println("enter first num")
    val num1 = readln().toInt()
    println("enter second num")
    val num2 = readln().toInt()

    if (num1 > num2){
        println("первое число больше")

    }
    else {
        println("второе число больше")
    }

    val max = if (num1 > num2) num1 else num2
    println("максимальное число: $max")

    val age = readln().toInt()
    val status = if (age>=18) "совершеннолетний" else "несовершеннолетний"
    println(status)

    println("ведите урон")
    val damage = readln().toInt()
    println("щит активен?")
    val shield = readln().lowercase()
    while (shield == "да") {
        val damage = damage / 2
        println("Полученный урон: $damage")
        break
    }

        val level = readln().toInt()
        val vip = readln().toBoolean()
        if ((level >= 30 && vip) || (level >= 50)){
            println("доступ разрешён")
        }
        else{
            println("Доступ не разрешён")
        }


        val month2 = listOf("python", "kotlin", "c#")
        println(month2[0])
        println(month2.size)
        println("kotlin" in month2)

        val monthdays = listOf(31,28,31,30,31,30,31,31,30,31,30,31)
        val daynumber = readln().toInt()

        if (daynumber in 1..12) {
            val result = monthdays[daynumber - 1]
            println("in this months $result days")
        }
        else {println("Not found. Try again")}
        /*
        val lowercase: Char = 'a'
        val uppercase: Char = 'F'
        val number3: Char = '1'
        val space: Char = ' '
        val dollar: Char = '$'
        val ch = '\u0040'
        println(ch)
        */





    //самостоятельные задания
    //1
    println("enter your level")
    val lvl = readln().toInt()
    if (lvl < 10) {
        println("вы новичок и получаете +10 hp")
    }
    else if ((lvl <= 10 || lvl < 50)){
        println("опытный, получаете +30hp")
    }
    else {
        println("Легенда. Получаете +100hp")
    }

    //2
    val age2 = readln().toInt()
    if (age2 < 12) {
        println("you`re children")
    }
    else if (age >= 12 && age <= 17){
        println("you`re teenager")
    }
    else {
        println("you`re adult")
    }

    //3


}