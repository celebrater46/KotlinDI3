// Null

fun main(args: Array<String>) {
//    val s: String = null
//    println(s) // Error (cannot input NULL to val: string
    val s: String? = null // nullable
//    println(s) // <- Check whether it is NULL. It is dangerous

//    if(s != null) {
//        println(s.length)
//    } else {
//        println(null)
//    }
    println(s?.length) // same above
    println(s?.length ?: -1) // null -> -1
    println(s!!.length) // null -> Exception
}