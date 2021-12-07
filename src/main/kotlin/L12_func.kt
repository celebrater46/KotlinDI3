//fun sayHi(){
//fun sayHi(name: String, age: Int){
fun sayHi(name: String = "NoName", age: Int = 100){
    println("Hi! $name($age)")
}

fun main(args: Array<String>){
//    sayHi()
    sayHi("seiko", 20)
    sayHi() // NoName, 100
    sayHi(age = 119, name = "SeaMaria")
}