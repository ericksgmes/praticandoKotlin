fun main() {
    val name = "Jorge"
    println(name.uppercase())
    println(name.lowercase())
    println(name[1])
    val age = 20
    val msg = "Name: $name; Age: $age"
    println(msg)
    val email = """ 
        
        %s@example.com
        email address
        email2@example.com
        email3@example.com
    """.trimIndent()
    println(email.format("gmail"))
}