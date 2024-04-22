fun main() {
    //val list: List<String> = mutableListOf("João", "Carlos")
    val list = mutableListOf("Java", "Kotlin", "C", "C++")
    println(list)
    println(list.last())
    println(list[0])
    println(list.contains("Carlos"))
    list.remove("Carlos")
    list.add("JS")
}