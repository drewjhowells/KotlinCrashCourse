//Open means the class can pass inheritance to other classes
//Abstract means it can pass inheritance, but cannot be its own class instance (Ie there can't just be an animal, but there can be a dog or cat that inherits from animal)
abstract class Animal(
    val name: String,
    val legCount: Int = 4
) {
    init {
        println("Hello my name is $name")
    }

    abstract fun makeSound()
    //This class must be implemented w/ override fun in every inheritance class
}