import java.security.KeyStore.TrustedCertificateEntry

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
    var damage = readln().toInt()
    println("щит активен?")
    val shield = readln().lowercase()
    while (shield == "да") {
        var damage = damage / 2
        println("Полученный урон: $damage")
        break

        var level = readln().toInt()
        var vip = readln().toBoolean()
        if ((level >= 30 && vip) || (level >= 50)){
            println("доступ разрешён")
        }
        else{
            println("Доступ не разрешён")
        }









    }




    //самостоятельные задания

}