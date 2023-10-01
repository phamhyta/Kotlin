fun main(args: Array<String>) {
    val decorations = listOf ("rock", "pagoda", "plastic plant", "alligator", "flowerpot")
    println( decorations.filter {it[0] == 'p'})
//    [pagoda, plastic plant]
    val eager = decorations.filter { it [0] == 'p' }
    println("eager: $eager")
//    eager: [pagoda, plastic plant]
    val filtered = decorations.asSequence().filter { it[0] == 'p' }
    println("filtered: $filtered")
//    filtered: kotlin.sequences.FilteringSequence@386cc1c4
    val newList = filtered.toList()
    println("new list: $newList")
//    new list: [pagoda, plastic plant]
    val lazyMap = decorations.asSequence().map {
        println("access: $it")
        it
    }
    println("lazy: $lazyMap")
    println("-----")
    println("first: ${lazyMap.first()}")
    println("-----")
    println("all: ${lazyMap.toList()}")
//    lazy: kotlin.sequences.TransformingSequence@5ba23b66
//    -----
//    access: rock
//    first: rock
//    -----
//    access: rock
//    access: pagoda
//    access: plastic plant
//    access: alligator
//    access: flowerpot
//    all: [rock, pagoda, plastic plant, alligator, flowerpot]
    val lazyMap2 = decorations.asSequence().filter {it[0] == 'p'}.map {
        println("access: $it")
        it
    }
    println("-----")
    println("filtered: ${lazyMap2.toList()}")
//    -----
//    access: pagoda
//    access: plastic plant
//    filtered: [pagoda, plastic plant]
    val mysports = listOf("basketball", "fishing", "running")
    val myplayers = listOf("LeBron James", "Ernest Hemingway", "Usain Bolt")
    val mycities = listOf("Los Angeles", "Chicago", "Jamaica")
    val mylist = listOf(mysports, myplayers, mycities)     // list of lists
    println("-----")
    println("Flat: ${mylist.flatten()}")
//    -----
//    Flat: [basketball, fishing, running, LeBron James, Ernest Hemingway, Usain Bolt, Los Angeles, Chicago, Jamaica]
}