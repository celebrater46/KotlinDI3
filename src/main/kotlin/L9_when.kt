fun main(args: Array<String>){
    val num: Int = 85
//    when(num){
//        0 -> println("zero")
//        1 -> println("one")
//        2, 3 -> println("two or three")
//        in 4..10 -> println("many")
//        else -> println("other")
//    }
    val result = when(num){
        0 -> "zero"
        1 -> "one"
        2, 3 -> "two or three"
        in 4..10 -> "many"
        else -> "other"
    }
    println(result)
}