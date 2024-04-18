fun main() {
    val name1 = "João"
    val name2: String = "João"
    val name3 = String("João".toCharArray()) // different new object
    val name4 = "João" // same object as name1
    println(name1 == name3) // compare contents
    println(name1 === name4) // compare memory location
    println(name1.equals(name3)) // compare contents
}