fun main(args: Array<String>) {
    val school = listOf("mackerel", "trout", "halibut")
    println(school)
//    [mackerel, trout, halibut]
    val myList = mutableListOf("tuna", "salmon", "shark")
    myList.remove("shark")
    println(myList)
//    [tuna, salmon]
//    kotlin.Boolean = true
    val school2 = arrayOf("shark", "salmon", "minnow")
    println(java.util.Arrays.toString(school2))
//    [shark, salmon, minnow]
    val mix = arrayOf("fish", 2)
    val numbers = intArrayOf(1,2,3)
    val numbers3 = intArrayOf(4,5,6)
    val foo2 = numbers3 + numbers
    println(foo2[5])
//    3
    val oceans = listOf("Atlantic", "Pacific")
    val oddList = listOf(numbers, oceans, "salmon")
    println(oddList)
//    [[I@89178b4, [Atlantic, Pacific], salmon]

    val array = Array (5) { it * 2 }
    println(java.util.Arrays.toString(array))
//    [0, 2, 4, 6, 8]
    val schools = arrayOf("shark", "salmon", "minnow")
    for (element in schools) {
        print(element + " ")
    }
//    shark salmon minnow
    for ((index, element) in school.withIndex()) {
        println("Item at $index is $element\n")
    }
//    Item at 0 is shark
//    Item at 1 is salmon
//    Item at 2 is minnow
    for (i in 1..5) print(i)
//    ⇒ 12345
    for (i in 5 downTo 1) print(i)
//    ⇒ 54321
    for (i in 3..6 step 2) print(i)
//    ⇒ 35
    for (i in 'd'..'g') print (i)
//    ⇒ defg
    var bubbles = 0
    while (bubbles < 50) {
        bubbles++
    }
    println("$bubbles bubbles in the water\n")

    do {
        bubbles--
    } while (bubbles > 50)
    println("$bubbles bubbles in the water\n")

    repeat(2) {
        println("A fish is swimming")
    }
//    50 bubbles in the water
//    49 bubbles in the water
//    A fish is swimmingA fish is swimming
}