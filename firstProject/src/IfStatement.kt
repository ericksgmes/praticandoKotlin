fun main() {
    val n1 = 10
    val n2 = 20
    val resultSimple = if (n1 > n2) "$n1 > $n2" else if (n1 < 11) "$n1 < 11" else "$n1 < $n2"
    val result = if (n1 > n2){
        "$n1 > $n2"
    } else if(n1 < 11) {
        //println("$n1 < 11")
        "$n1 < 11"
    } else {
        "$n1 < $n2"
    }
    println(resultSimple)
}