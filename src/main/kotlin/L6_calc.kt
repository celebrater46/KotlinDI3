fun main(args: Array<String>){
    // + - * / %
    val x = 10
    println(x / 3) // 3
    println(x / 3.0) // 3.333....
    println(x % 3) // 1

    // ++ --
    var y = 5
    y++
    println(y) // 6
    y--
    println(y) // 5

    var z = 4
    /*z = z + 12*/
    z += 12

    // AND OR NOT
    // && || !
    val flag = true
    println(!flag) // false
}