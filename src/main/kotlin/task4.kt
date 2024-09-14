fun main(args: Array<String>) {
    println("Введите два чисала и знак действия: ")
    var a = readln().toDouble()
    var b = readln().toDouble()
    var z = readln()
    if(b == 0.0 && z == "/")
        print("На ноль делить нельзя!")
    else
    {
        when(z){
            "-" -> print(a-b)
            "+" -> print(a+b)
            "*" -> print(a*b)
            "/" -> print(a/b)
            else -> "Нет такой действия("
        }
    }
}