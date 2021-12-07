// Exception

class MyException(message: String) : Throwable(message) {

}

fun div(x: Int, y: Int) {
    println(x / y)
}

fun div2(x: Int, y: Int) {
    try {
        if(y < 0) {
            throw MyException("Not minus!")
        }
        println(x / y)
    } catch (e: ArithmeticException) {
        println(e.message)
    } catch (e: MyException) {
        println(e.message)
    } finally {
        println("-- end --")
    }
}

fun main(args: Array<String>) {
//    div(3, 0) // Error (ArithmeticException)
    div2(3, 0) // by zero
    div2(3, -3) // Not minus!
}