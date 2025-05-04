<!-- BasicKotlinExamples.mdx -->

import { CodeBlock } from '@theme/CodeBlock';

# 📘 Basic Kotlin Code Examples

A collection of essential Kotlin code snippets to help beginners understand Kotlin syntax and concepts.

---

## ✅ 1. Hello World

<CodeBlock language="kotlin">
{`fun main() {
    println("Hello, World!")
}`}
</CodeBlock>

---

## ✅ 2. Variables and Constants

<CodeBlock language="kotlin">
{`fun main() {
    var name = "Ankit"  // Mutable
    val age = 21         // Immutable

    println("Name: $name, Age: $age")
}`}
</CodeBlock>

---

## ✅ 3. Data Types

<CodeBlock language="kotlin">
{`fun main() {
    val number: Int = 10
    val pi: Double = 3.14
    val isActive: Boolean = true
    val letter: Char = 'K'
    val message: String = "Kotlin"

    println("$number, $pi, $isActive, $letter, $message")
}`}
</CodeBlock>

---

## ✅ 4. If-Else Statement

<CodeBlock language="kotlin">
{`fun main() {
    val score = 85

    if (score >= 90) {
        println("Grade A")
    } else if (score >= 75) {
        println("Grade B")
    } else {
        println("Grade C")
    }
}`}
</CodeBlock>

---

## ✅ 5. When Expression (Switch)

<CodeBlock language="kotlin">
{`fun main() {
    val day = 3

    val result = when (day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        else -> "Unknown"
    }

    println(result)
}`}
</CodeBlock>

---

## ✅ 6. For Loop

<CodeBlock language="kotlin">
{`fun main() {
    for (i in 1..5) {
        println("Count: $i")
    }
}`}
</CodeBlock>

---

## ✅ 7. While Loop

<CodeBlock language="kotlin">
{`fun main() {
    var i = 1
    while (i <= 5) {
        println(i)
        i++
    }
}`}
</CodeBlock>

---

## ✅ 8. Functions

<CodeBlock language="kotlin">
{`fun add(a: Int, b: Int): Int {
    return a + b
}

fun main() {
    println("Sum: " + add(3, 4))
}`}
</CodeBlock>

---

## ✅ 9. Classes and Objects

<CodeBlock language="kotlin">
{`class Person(val name: String, val age: Int) {
    fun greet() {
        println("Hi, I'm $name and I'm $age years old.")
    }
}

fun main() {
    val person = Person("Ankit", 21)
    person.greet()
}`}
</CodeBlock>

---

## ✅ 10. Null Safety

<CodeBlock language="kotlin">
{`fun main() {
    var name: String? = null
    println(name?.length ?: "Name is null")
}`}
</CodeBlock>

---

## ✅ 11. Collections (List, Set, Map)

<CodeBlock language="kotlin">
{`fun main() {
    val list = listOf("A", "B", "C")
    val set = setOf(1, 2, 2, 3)
    val map = mapOf("name" to "Ankit", "age" to 21)

    println(list)
    println(set)
    println(map)
}`}
</CodeBlock>

---

## ✅ 12. Lambda Expression

<CodeBlock language="kotlin">
{`fun main() {
    val square: (Int) -> Int = { it * it }
    println("Square of 4: " + square(4))
}`}
</CodeBlock>

---

## ✅ 13. Extension Function

<CodeBlock language="kotlin">
{`fun String.addHashtag(): String {
    return "#$this"
}

fun main() {
    println("Kotlin".addHashtag())
}`}
</CodeBlock>

---

## ✅ 14. Data Class

<CodeBlock language="kotlin">
{`data class User(val name: String, val age: Int)

fun main() {
    val user = User("Ankit", 21)
    println(user)
}`}
</CodeBlock>

---

## ✅ 15. Android Log Example

<CodeBlock language="kotlin">
{`import android.util.Log

fun logExample() {
    Log.d("TAG", "This is a debug message")
}`}
</CodeBlock>

---

Let me know if you'd like an export of this as a `.mdx` file or a more advanced version (like using coroutines or Android UI examples).
