fun main() {
    //Hello World
    println("Hello World!")
    println("line 2")
    print("line 3")

    //Strings
    val writer = "Howells"
    println(writer[0])
    println(writer[1])
    println(writer.isEmpty())
    println(writer.length)

    //Variables
    val myName = "Drew"
    var myAge = 24
    println(myName)
    print(myAge)
    //Min/Max Values
    var hugeInt: Int = Int.MAX_VALUE
    var tinyInt: Int = Int.MIN_VALUE
    println("Maximum value of integer is $hugeInt")
    println("Minimum value of integer is $tinyInt")

    val city1 = "Denver"
    val city2 = "Moscow"
    val city3 = "Phoenix"
    val cities = mutableListOf<Any>("Denver", "Moscow", "Phoenix")

    //Collections
    println(cities[0])
    cities.add("Rome")
    println(cities)
    cities.remove(cities[1])
    println(cities)
    cities.add(10)
    println(cities)
    for( i in 1 .. 4)
        println(i)
    for (i in 1 until 5)
        println(i)

    //While loop
    var index = 0
    while (index < cities.size){
        println("City at $index index is ${cities[index]}")
        index ++
    }

    //Operators
    val name = "Britney"
    val surname = "Spears"
    val fullName = "$name $surname"
    println(fullName)

    //conditionals
    if (myAge >= 21) {
        println("You can drink")
    } else {
        println("You can't drink")
    }

    //Functions
    fun sayHello() {
        println("Hello!")
    }

    //If not marked private, they are public by default
    fun sayHelloToSomeone(name: String) {
        println("Hello, $name !")
    }
    //If a simple operation function, it can be written in one line like this:
    fun add() :Int = 20 + 30
    // :Type denotes the type the fun returns, (Parameters passed to function go here)
    fun divide(x:Int, y:Int): Int = x / y
    //You can set default values for parameters
    fun isEven(number: Int = 10): Boolean {
        return number % 2 == 0
    }
    //Extension functions
    fun Int.isOdd(): Boolean {
        return this % 2 == 1
        //this refers to whatever the object of the function is, the int in this instance
    }

    fun main() {
        sayHello()
        sayHelloToSomeone("John")
        println(add())
        println(divide(100, 50))

        val dog = Dog()
        dog.bark()
        //Anonymous Class using temp object
        val bear = object : Animal("Black Bear")
        {
            override fun makeSound() {
                println("ROAR!!")
            }
        }

        //Exceptions
        val number = readLine() ?: "0"
        val parsedNumber = try {
            number.toInt()
        } catch(e: Exception) {
            0
        }
        println(parsedNumber)
    }

    //Null Safety
    val data: String? = "Student Data Completed!"
    if (data != null) {
        println(data.lowercase())
    }
    println(data?.uppercase())

    //When statement (Switch)
    val x= 3
    when (x) {
        in 1..2-> println("x is between 1 and 2")
        in 3..10->println("x is between 3 and 10")
        else -> {
            println("x is not between 1 and 10")
        }
    }


}