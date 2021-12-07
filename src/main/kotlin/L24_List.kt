// Collection (List, Set, Map)
// List is an array with an order
// Immutable List cannot change, Mutable List can change
// Immutable Collection is major

fun main(args: Array<String>){
//    val sales: List<Int> = listOf(20, 30, 40)
    val sales = listOf(20, 30, 40)
    println(sales[1]) // 30
    println(sales.size) // 3

//    sales[2] = 60 // Error

    for(sale in sales){
        println(sale)
    }

    val salesM = mutableListOf<Int>(30, 40, 50)
    salesM[2] = 10

    for(sale in salesM) {
        println(sale)
    }
}