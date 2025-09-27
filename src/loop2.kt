fun main() {
/*var number = 1
while (number<=5) {
    println("число: $number")
    number++
if (number == 5) {
    println("станавливаемся на $number")
    break
}
}
var number2 = 0
    while (number2 < 10) {
        number2++
        if (number2 == 3) {
            println("останавливаемся на $number2")
            continue
        }
        println(number2)
    }

    println("введите что-нибудь (для выхода напишите -выход-:")
    while (true){
        val input = readLine()
        if (input == "выход"){
            println("goodbye")
            break
        }
        println("вы ввели: $input")
    }


var letter = 'A'
    while (letter <= 'Z'){
        println(letter)
        letter++
    }
println("enter password ")
    var password : String? = readln()
    while (password != "qwerty"){
        println("enter password ")
        password = readln()
    }
println("доступ разрешен")

for (i in 1..5){
    println("шаг $i") }
    var fruits = listOf("apple", "orange", "cherry")
    for (i in fruits){
        println("fruit: $fruits") }

    val slovo = "kotlin is funny"
    val words = slovo.split(" ")
    println(words)

    val data = "apple, orange, cherry"
    val result = data.split(",")
    for (res in result){
        println(res)
    }
    val messy = "word1,word2:word3;word4"
    val parts = messy.split(",",";",":","|")
    println(parts)
    */
    val fullname = "Петров Петр"
    val parts = fullname.split(" ")
    val lastname = parts[0]
    val firstname = parts[1]
    println("first name $firstname, last name $lastname")

    println("enter numbers")
    val input = readln()
    val result2 = input.split(" ")
    var sum = 0
    for (i in result2){
        sum += i.toInt()
    }
    println("summa: $sum")


















}

