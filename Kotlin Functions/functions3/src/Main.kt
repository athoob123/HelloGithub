fun currentTemperature(morningTemp: Int, afternoonTemp: Int): Int {
    return (morningTemp + afternoonTemp)/ 2
}

fun main() {
    val averageTemp = currentTemperature(25, 40)

    println("Average temperature: $averageTemp")
}