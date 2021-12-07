class User {
    var name: String = "NoName"
    fun sayHi() {
        println("Hi $name!!")
    }
}

fun main(args: Array<String>){
//    val user: User = User()
    val user = User() // new User()
    println(user.name)
    user.sayHi()
    user.name = "hideru"
    println(user.name)
    user.sayHi()
}