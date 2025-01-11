fun main() {
    val numbers = mutableListOf(1, 2, 3)
    var doubled = numbers.map { it * 2 }
    println(doubled) // Output: [2, 4, 6]

    numbers.add(4)
    doubled = numbers.map { it * 2 }
    println(doubled) // Output: [2, 4, 6, 8]

    //Alternative solution for dynamic updates
    val dynamicDoubled = mutableListOf<Int>()
    numbers.forEach { dynamicDoubled.add(it * 2) }
    println(dynamicDoubled) //Output: [2,4,6,8]
    numbers.add(5)
    dynamicDoubled.add(numbers.last()*2) //Output: [2,4,6,8,10] 
    println(dynamicDoubled)
} 