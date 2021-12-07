import java.util.*

// getter and setter are working below the surface (setter is unavailable in case of VAL)
class User3(var name: String = "NoName") {
    var team = "red"

    // getter
//    get() {
////        return field.toUpperCase()
//        return field.uppercase(Locale.getDefault())
//    }
//    get() = field.toUpperCase()
    get() = field.uppercase(Locale.getDefault())

    // setter
    set(value) {
        if(value != ""){
            field = value
        }
    }

    fun sayHi() {
        println("Hi $name!!")
    }
}

fun main(args: Array<String>){
    val hideru = User3("hideru")
    hideru.sayHi()
    println(hideru.team) // RED
    hideru.team = "white"
    println(hideru.team) // WHITE
    hideru.team = ""
    println(hideru.team) // WHITE
}