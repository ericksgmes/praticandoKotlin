fun main() {
    val names = arrayOf("Los Hermanos", "Mozart", "Júlia", "João", "Carlos","Márcio", "Anna", "Paula")
    val musica = "Anna Júlia | Los Hermanos"
    for(name in names.reversed()) {
        if (name in musica) print("$name ")
        if (name == "Mozart") break
    }
}