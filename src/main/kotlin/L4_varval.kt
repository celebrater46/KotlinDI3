// L4

// val cannot change
// var can change

fun main(args: Array<String>){
//    val msg: String = "Hello World"
    val msg = "Hello World" // can omit typy declaration
    println(msg)
//    msg = "Hello World Again!" // Failure to compile
//    println(msg)
    var msg2 = "Hello World 2" // can omit typy declaration
    println(msg2)
    msg2 = "Hello World 2 Again!"
    println(msg2)
}