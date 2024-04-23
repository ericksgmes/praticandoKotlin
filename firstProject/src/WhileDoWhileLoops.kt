fun main() {
    val name = "Erick"
    var num = 0
    while (num < name.length) {
        print(name[num])
        num++
    }
    var i = 0
    var cond = true
    do {
        print(i)
        i++
        if (i == 10) cond = false
    } while (cond)
}