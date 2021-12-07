// abstruct
open class User7(public var name: String = "NoName") {
    open fun sayHi() {
        println("Hi, $name!!")
    }
}

fun main(args: Array<String>){
    val hideru = User7("hideru")
    hideru.sayHi()
}