// Abstract Class
// Only inheritance, cannot create this as a new instance

abstract class User7 {
    abstract fun sayHi()
}

class Japanese: User7() {
    // v Error will occur without this
    override fun sayHi() {
        println("こんにちは！")
    }
}

class American: User7() {
    override fun sayHi() {
        println("Hi!")
    }
}

fun main(args: Array<String>){
    val hideru = Japanese()
    hideru.sayHi()
    val sally = American()
    sally.sayHi()
}