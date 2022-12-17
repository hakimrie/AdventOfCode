fun main() {
    var maxCalories = 0
    var totalCalories = 0
    val eachElvesTotalCalories = mutableListOf<Int>()
    val testInput = readInput("Day01_test")
    testInput.forEach {
        if (it.isEmpty()) {
            eachElvesTotalCalories.add(totalCalories)
            if (maxCalories < totalCalories) maxCalories = totalCalories
            totalCalories = 0
        } else {
            totalCalories += it.toInt()
        }
    }
    println("part 1: $maxCalories") // 71023
    eachElvesTotalCalories.sortDescending()
    println("part 2: ${eachElvesTotalCalories.take(3).sum()}") // 206289
}
