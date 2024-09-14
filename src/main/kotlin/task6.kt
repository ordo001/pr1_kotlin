fun main(args: Array<String>) {
    print("Введите два числа: ")
    var a1 = readln().toInt()
    var a2 = readln().toInt()
    if((a1*10 + a2) % 2 > 0)
        print("Созданное нечетное число: " + (a1*10+a2))
    else
        if((a2*10 + a1) % 2 > 0)
            print("Созданное нечетное число: " + (a2*10+a1))
        else
            print("Не возможно создать число(")
}