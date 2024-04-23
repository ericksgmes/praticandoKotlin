fun main() {
    // (hi, age) = greet("João")

    var (hi,age) = greet(age=19, name="Erick")
    println("${hi}, the double of your age is ${double(age)}")
    /*
    foo(bar = {
        println("bar invoke")
    })
    foo() {
        println("bar invoke 2")
    }
    */
}
fun foo(bar: () -> Unit) {
    println("Bar function")
    bar.invoke()
}

fun greet(name: String, age: Int = -1):Pair<String, Int>{
    if (age < 0){
        return "Age not provided" to age
    }
    return "Hello $name 🌎\nYou are $age years old 👌🏻" to age
}

fun double(age: Int) = age * 2
//fun double(age: Int): Int {
//    return age * 2
//}
