class Point(val x: Int, val y: Int)

data class PointD(val x: Int, val y: Int)

fun main(args: Array<String>){
    val p1 = Point(2, 5)
    val p2 = Point(2, 5)

    println(p1) // Point@4517d9a3
    println(if(p1 == p2) "Same" else "Not same") // Not same (It can be same!)
    // Why different? Because p1 and p2 are not same instances!

    val p1d = PointD(2, 5)
//    val p2d = PointD(2, 5)
    val p2d = p1d.copy()


    println(p1d) // PointD(x=2, y=5)
    println(if(p1d == p2d) "Same" else "Not same") // Same

    val(x, y) = p1d
    println("x: $x, y: $y") // x: 2, y: 5
}