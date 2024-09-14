import kotlin.math.pow
import kotlin.math.log
fun main(args: Array<String>) {
    //Задача 1
    val inputVal = readln()
    var result = ""
    var countChar = 1
    var previousChar = inputVal[0]

    for(i in 1.. inputVal.length - 1){
        if(previousChar == inputVal[i]){
            countChar+=1
            previousChar = inputVal[i]
        }
        else
        {
            if(countChar > 1){
                result = result + countChar + previousChar
            } else {
                result = result + previousChar
            }
            countChar = 1
            previousChar = inputVal[i]
        }

    }
    if(countChar > 1){
        result = result + countChar + previousChar
    }
    else{
        result = result + previousChar
    }
    print(result)
}