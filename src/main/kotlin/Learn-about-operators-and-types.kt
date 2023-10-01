fun main(args: Array<String>) {
    fun printHello() {
        println("Hello World")
    }
    printHello()
//  Hello World
    val i: Int = 6
    val b1 = i.toByte()
    println(b1)
    //⇒ 6
    val b2: Byte = 1 // OK, literals are checked statically
    println(b2)
    //⇒ 1
//    val i1: Int = b2
//    ⇒ error: type mismatch: inferred type is Byte but Int was expected
//    val i2: String = b2
//    ⇒ error: type mismatch: inferred type is Byte but String was expected
//    val i3: Double = b2
//    ⇒ error: type mismatch: inferred type is Byte but Double was expected
    val i4: Int = b2.toInt() // OK!
    println(i4)
//    ⇒ 1
    val i5: String = b2.toString()
    println(i5)
//    ⇒ 1
    val i6: Double = b2.toDouble()
    println(i6)
//    ⇒ 1.0
    val oneMillion = 1_000_000
    val socialSecurityNumber = 999_99_9999L
    val hexBytes = 0xFF_EC_DE_5E
    val bytes = 0b11010010_01101001_10010100_10010010
    println(oneMillion)
    println(socialSecurityNumber)
    println(hexBytes)
    println(bytes)
    var fish = 1
    fish = 2
    val aquarium = 1
//    aquarium = 2
//    ⇒ error: val cannot be reassigned
//    ⇒ res20: kotlin.String = I have 5 fish and 12 plants
    println(bytes)
}