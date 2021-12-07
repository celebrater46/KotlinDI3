// Collection
// Map (Immutable / Mutable
// It is same with JS Object that has Key and Value

fun main(args: Array<String>){
//    val users: Map<String, Int> = mapOf("hideru" to 98, "seiko" to 45, "miyabi" to 95)
//    val users = mapOf("hideru" to 98, "seiko" to 45, "miyabi" to 95)
    val users = mutableMapOf("hideru" to 98, "seiko" to 45, "miyabi" to 95)
    users["seiko"] = 100


    println(users["hideru"]) // 98
    println(users.size) // 3
    println(users.keys)
    println(users.values) // print all keys and values
}