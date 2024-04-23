fun main() {
    val letters = charArrayOf('A', 'B', 'C', 'D', 'E', 'F')
    for (index in letters.indices) {
        println("$index letter: ${letters[index]}")
    }
    println("Reversed")
    for (index in letters.indices.reversed()) {
        println("$index letter: ${letters[index]}")
    }
}