// Can add var and function to class from outside

fun User6.sayHello() {
    println("Hello! $name")
}

fun User6.sayHi(){
    println("ex: Hi, $name!!!!!!!!!!!!!!!!!")
}

val User6.myName: String
//    get() = "I am $myName" // Exception in thread "main" java.lang.StackOverflowError
    get() = "I am $name"

open class User6(public var name: String = "NoName") {
    open fun sayHi() {
        println("Hi, $name!!")
    }
}

fun main(args: Array<String>){
    val hideru = User6("hideru")
    hideru.sayHi() // Hi, hideru!!
    hideru.sayHello() // Hello, hideru!
    println(hideru.myName) // I am hideru
}