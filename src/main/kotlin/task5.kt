import kotlin.math.log

fun main(args: Array<String>) {
    println("Введите два числа: ")
    var a = readln().toDouble()
    var b = readln().toDouble()
    var z = log(b,a)
    if(z % 1 == 0.0)
        print(z)
    else
        print("Ответ не целочисленный")
}