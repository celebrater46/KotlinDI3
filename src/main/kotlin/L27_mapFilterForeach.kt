fun main(args: Array<String>) {
    val prices = listOf(32.2, 45.5, 67.7)
    prices
//        .map { n -> n * 1.1 } // argument -> return
        .map { it * 1.1 } // same above

//        .filter { n -> n > 50 } // 67.7
        .filter { it > 50 } // 67.7 (same above)

        .forEach { println(it) }
}