import java.util.*

// Inheritance
// User(super class) : AdminUser(sub class)

class AdminUser(name: String) : User4(name) {
    fun sayHello() {
        println("Hello Admin: $name")
    }

    override fun sayHi() {
        println("Hi, Admin: $name!!!!!!!!!!!!!!!!!!!!!!")
    }
}

//class User4(var name: String = "NoName") {
// V Must add "open" to inherit
open class User4(var name: String = "NoName") {
//    fun sayHi() {
    // Must add "open" to override
    open fun sayHi() {
        println("Hi, $name!!")
    }
}

fun main(args: Array<String>){
    val hideru = User4("hideru")
    hideru.sayHi()
    val hizuru = AdminUser("hizuru")
    hizuru.sayHi()
    hizuru.sayHello()
}