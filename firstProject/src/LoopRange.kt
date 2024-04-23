fun main() {
    val n = 14
    println("range with step")
    for (i in 1..n step 7)
        println(i)
    println("downTo with step")
    for (i in n downTo 1 step 7)
        println(i)
}