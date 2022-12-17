fun main() {
    var maxCalories = 0
    var totalCalories = 0
    val testInput = readInput("Day01_test")
    testInput.forEach {
        if (it.isEmpty()) {
            if (maxCalories < totalCalories) maxCalories = totalCalories
            totalCalories = 0
        } else {
            totalCalories += it.toInt()
        }
    }

    println("$maxCalories") // 71023
}
