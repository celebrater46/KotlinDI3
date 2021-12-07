//class User2() {
//class User2(name: String) {
class User2(var name: String = "NoName") {
//    var name: String = "NoName"
    var team = "red"
    init {
        println("instance created, name: $name, team: $team")
    }

    fun sayHi() {
        println("Hi $name!!")
    }
}

fun main(args: Array<String>){
    val hideru = User2("hideru")
//    hideru.name = "hideru"
    hideru.sayHi()
    val seiko = User2("seiko")
    seiko.sayHi()
}