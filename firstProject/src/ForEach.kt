fun main() {
    val names = mutableListOf<String>("John", "Peter", "Jan")
    names.forEach {println(it)}
    for (name in names) {println(name)}
}