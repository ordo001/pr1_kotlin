fun main(args: Array<String>) {
    println("Введите строку")
    val input = readln()
    var char = input.toList().distinct().sorted()
    var result = ""
    for(i in char){
        result +=  "$i - ${input.count{c -> c == i}}\n"
    }
    println("Результат: " + result)
}