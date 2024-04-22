fun main() {
    val gender = "M"
    val g = when (gender) {
        "M" -> "Male"
        "F" -> "Female"
        else -> "Unknown"
    }
    println(g)

    val age = 18
    when (age) {
        in 0..17 -> println("Underage")
        in 0..19 -> println("Not under age")
    }
}