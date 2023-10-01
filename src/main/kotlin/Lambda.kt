fun main(args: Array<String>) {
    var dirtyLevel = 20
    val waterFilter1 = { dirty : Int -> dirty / 2}
    println(waterFilter1(dirtyLevel))
    val waterFilter: (Int) -> Int = { dirty -> dirty / 2 }
//    10
    fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
        return operation(dirty)
    }
    val waterFilter2: (Int) -> Int = { dirty -> dirty / 2 }
    println(updateDirty(30, waterFilter2))
//    15
    fun increaseDirty( start: Int ) = start + 1
    println(updateDirty(15, ::increaseDirty))
//    16
    var dirtyLevel2 = 19
    dirtyLevel = updateDirty(dirtyLevel) { dirtyLevel2 -> dirtyLevel + 23}
    println(dirtyLevel)
//    42
}