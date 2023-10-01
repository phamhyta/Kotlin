fun main(args: Array<String>) {
//    var rocks: Int = null
//    error: null can not be a value of a non-null type Int
    var marbles: Int? = null
//    var fishFoodTreats = 6
//    if (fishFoodTreats != null) {
//        fishFoodTreats = fishFoodTreats.dec()
//    }
    var fishFoodTreats = 6
//    fishFoodTreats = fishFoodTreats?.dec()
    fishFoodTreats = fishFoodTreats?.dec() ?: 0
//    val len = s!!.length
// throws NullPointerException if s is null
}