fun main() {
    val names = arrayOf("John", 18, "Jane", 19) //cannot bet expanded
    // nor shrunk
    println(names[1])
    names[2] = "Jamila"
    println(names.contentToString())
    println("Size of Array: ${names.size}")
    if("John" in names) {
        println("found")
    } else {
        println("not found")
    }

    val newArray = arrayOfNulls<String>(3)
    newArray.fill("$")
    println(newArray.contentToString())
}