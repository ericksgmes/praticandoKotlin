fun main() {
    val names = listOf("juli", "lee")
    val numbers = intArrayOf(1,2,3,4,5)
    for (name in names) {
        val n = name.replaceFirstChar {
            it.uppercase()
        }
        println(n)
    }
    for (number in numbers) print(number)
}