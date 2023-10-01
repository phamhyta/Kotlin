import java.util.*
//fun fishFood (day : String) : String {
//    var food = ""
//    when (day) {
//        "Monday" -> food = "flakes"
//        "Tuesday" -> food = "pellets"
//        "Wednesday" -> food = "redworms"
//        "Thursday" -> food = "granules"
//        "Friday" -> food = "mosquitoes"
//        "Saturday" -> food = "lettuce"
//        "Sunday" -> food = "plankton"
//    }
//    return food
//}
fun fishFood (day : String) : String {
    return when (day) {
        "Monday" -> "flakes"
        "Wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Sunday" -> "plankton"
        else -> "nothing"
    }
}
//fun feedTheFish() {
//    val day = randomDay()
//    val food = "pellets"
//    println ("Today is $day and the fish eat $food")
//}
fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)

    println ("Today is $day and the fish eat $food")
}
fun randomDay() : String {
    val week = arrayOf ("Monday", "Tuesday", "Wednesday", "Thursday",
        "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(week.size)]
}
fun main(args: Array<String>) {
    println("Hello, ${args[0]}")
    // Will assign kotlin.Unit
    val isUnit = println("This is an expression")
    println(isUnit)
//    This is an expression
//    kotlin.Unit
    val temperature = 10
    val isHot = if (temperature > 50) true else false
    println(isHot)
//    false
    val message = "The water temperature is ${ if (temperature > 50) "too warm" else "OK" }."
    println(message)
//    The water temperature is OK.
    feedTheFish()
//    Today is Tuesday and the fish eat pellets
//    Today is Monday and the fish eat granules
//    Today is Tuesday and the fish eat nothing
}