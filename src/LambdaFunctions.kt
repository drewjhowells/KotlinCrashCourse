fun main() {
    val list = listOf("Kotlin", "is", "fun")
    val count = list.count { currentString ->
        currentString.length == 3
        //It returns the last line of the function
    }
    val customCount = list.customCount { currentString ->
        currentString.length >= 3
        //It returns the last line of the function
    }
    println(count)
    println(customCount)
}

//extensionFunction Type.functionName(lambdaFunction: (parameter)  -> lambdaReturnType): extensionReturnType {
fun List<String>.customCount(function: (String) -> Boolean): Int {
    var counter = 0
    for(string in this){
        if(function(string)){
            counter++
        }
    }
    return counter
}

//putting <VariableType> means that any type can be passed to the function using VariableType
fun <T> List<T>.doSomething(lambdaFunction: (T) -> Boolean): Int {
    println("0")
}