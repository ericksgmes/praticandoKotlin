fun main() {
    val tv = SmartDevice("Samsung", 3499.00)
    tv.turnOn()
    println(tv)
    val laptop = SmartDevice("Apple")
    laptop.price = 6499.00
    laptop.turnOff()
    println(laptop)
    val smartphone = SmartDevice()
    smartphone.brand = "Motorola"
    smartphone.price = 2400.00
    println(smartphone)
    val tv2 = SmartDevice("Samsung", 3499.00)
    println(tv == tv2) // object contents
    println(tv === tv2) // memory location
}

class SmartDevice (
    var brand: String? = null,
    var price: Double? = null,
    private var isTurnedOn: Boolean = false
) {
    constructor() : this("", 0.0)
    constructor(brand: String) : this(brand, 0.0)
    fun turnOn(){
        isTurnedOn = true
        println("$brand is turning on")
    }

    fun turnOff(){
        isTurnedOn = false
        println("$brand is turning off")
    }

    fun getState() {
        println(isTurnedOn)
    }

    override fun toString(): String {
        return "$brand, $price" + if (isTurnedOn) " is ON" else " is OFF"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as SmartDevice

        if (brand != other.brand) return false
        if (price != other.price) return false

        return true
    }

    override fun hashCode(): Int {
        var result = brand?.hashCode() ?: 0
        result = 31 * result + (price?.hashCode() ?: 0)
        result = 31 * result + isTurnedOn.hashCode()
        return result
    }

}