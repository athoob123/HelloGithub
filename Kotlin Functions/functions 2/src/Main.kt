fun findOasis(x: Int, y: Int): String {
    return "Oasis found at coordinates ($x, $y)"
}

fun main() {
    val location = findOasis(10, 20)

    println(location)
}