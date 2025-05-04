// BasicKotlinExamples.kt

// 1. Hello World
fun helloWorld() {
    println("Hello, Kotlin!")
}

// 2. Variables and Constants
fun variables() {
    var mutable = "I can change"
    val immutable = "I cannot change"
    println(mutable)
    println(immutable)
}

// 3. Data Types and Type Inference
fun dataTypes() {
    val name: String = "Ankit"
    val age: Int = 21
    val pi = 3.14  // Double inferred
    val isKotlinFun = true
    println("Name: $name, Age: $age, Pi: $pi, Kotlin fun: $isKotlinFun")
}

// 4. Functions
fun greet(name: String): String {
    return "Hello, $name!"
}

// 5. If-Else Expression
fun checkNumber(x: Int) {
    if (x > 0) println("Positive")
    else if (x < 0) println("Negative")
    else println("Zero")
}

// 6. When Expression (Switch equivalent)
fun describe(x: Any) {
    when (x) {
        1 -> println("One")
        "Hello" -> println("Greeting")
        is Long -> println("Long")
        !is String -> println("Not a String")
        else -> println("Unknown")
    }
}

// 7. Loops: For, While, Do-While
fun loops() {
    for (i in 1..5) println("For loop: $i")
    var x = 5
    while (x > 0) {
        println("While loop: $x")
        x--
    }
    do {
        println("Do-While loop: $x")
        x++
    } while (x < 3)
}

// 8. Collections
fun collections() {
    val items = listOf("apple", "banana", "kiwi")
    for (item in items) println(item)

    val mutableItems = mutableListOf("apple", "banana")
    mutableItems.add("orange")
    println(mutableItems)
}

// 9. Null Safety
fun nullSafety() {
    var name: String? = "Kotlin"
    name = null
    println(name?.length)  // Safe call operator
}

// 10. Classes and Objects
class Person(val name: String, var age: Int) {
    fun introduce() {
        println("My name is $name and I am $age years old.")
    }
}

// 11. Data Class
data class User(val id: Int, val username: String)

// 12. Inheritance
open class Animal {
    open fun sound() = println("Animal sound")
}

class Dog : Animal() {
    override fun sound() = println("Bark")
}

// 13. Interface
interface Clickable {
    fun click()
}

class Button : Clickable {
    override fun click() = println("Button clicked!")
}

// 14. Lambda Expression
fun lambdaExample() {
    val sum: (Int, Int) -> Int = { a, b -> a + b }
    println("Sum: ${sum(5, 3)}")
}

// 15. Higher-Order Function
fun operate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
    return operation(x, y)
}

// 16. Extension Function
fun String.addKotlin(): String {
    return this + " Kotlin"
}

// 17. Companion Object
class MyClass {
    companion object {
        fun create(): MyClass = MyClass()
    }
}

// 18. Exception Handling
fun exceptionExample() {
    try {
        val data = 10 / 0
        println(data)
    } catch (e: ArithmeticException) {
        println("Caught ArithmeticException: ${e.message}")
    } finally {
        println("Finally block executed")
    }
}

// 19. Ranges
fun rangeExample() {
    for (i in 1..5) print("$i ")
    println()
    for (i in 5 downTo 1 step 2) print("$i ")
    println()
}

// 20. Enum Class
enum class Direction {
    NORTH, SOUTH, EAST, WEST
}

fun enumExample(dir: Direction) {
    when (dir) {
        Direction.NORTH -> println("Go up")
        Direction.SOUTH -> println("Go down")
        else -> println("Other direction")
    }
}

// Main function to run examples
fun main() {
    helloWorld()
    variables()
    dataTypes()
    println(greet("Ankit"))
    checkNumber(0)
    describe("Hello")
    loops()
    collections()
    nullSafety()

    val person = Person("Ankit", 21)
    person.introduce()

    val user = User(1, "ankit123")
    println(user)

    val dog = Dog()
    dog.sound()

    val btn = Button()
    btn.click()

    lambdaExample()
    println("Result of operate: ${operate(10, 5) { a, b -> a * b }}")

    println("Hello".addKotlin())

    val obj = MyClass.create()
    println("MyClass created: $obj")

    exceptionExample()
    rangeExample()
    enumExample(Direction.SOUTH)
}
