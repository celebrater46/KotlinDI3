// Generics
class MyInteger {
    fun getThree(x: Int){
        println(x)
        println(x)
        println(x)
    }
}

// Can use any data type of argument
class MyData<T> {
    fun getThree(x: T){
        println(x)
        println(x)
        println(x)
    }
}

fun main(args: Array<String>){
    val mi = MyInteger()
    mi.getThree(55) // 55 * 3 (Can use only INT)
    val md = MyData<Int>()
    md.getThree(32)
    val mds = MyData<String>()
    mds.getThree("Hello World!")
}