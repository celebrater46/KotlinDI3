// public (default)
// protected
// private

class AdminUser2(name: String) : User4(name) {
    fun sayHello() {
        println("Hello Admin: $name")
    }

    override fun sayHi() {
        println("Hi, Admin: $name!!!!!!!!!!!!!!!!!!!!!!")
    }
}

//open class User5(public var name: String = "NoName") {
//open class User5(protected var name: String = "NoName") {
open class User5(private var name: String = "NoName") {
    open fun sayHi() {
        println("Hi, $name!!")
    }
}

fun main(args: Array<String>){
    val hideru = User5("hideru")
    hideru.sayHi()
    val hizuru = AdminUser2("hizuru")
    hizuru.sayHi()
    hizuru.sayHello()
}