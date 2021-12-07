// Collection
// Set (Immutable / Mutable
// It has no order, cannot have same value

fun main(args: Array<String>){
    // Immutable
//    val answers: Set<Int> = setOf<Int>(20, 3, 5, 8, 5)
    val answers = setOf(3, 5, 8, 5) // cannot has same value (3, 5, 8)
    println(answers) // 3, 5, 8
    println(answers.contains(3)) // true (answers has 3?)

    val set1 = setOf(1, 3, 5, 8)
    val set2 = setOf(3, 5, 8, 9)
    println(set1.intersect(set2)) // 3, 5, 8 (set1 * set2)
    println(set1.union(set2)) // 1, 3, 5, 8, 9 (set1 + set2)
    println(set1.subtract(set2)) // 1 (set1 - set2)

    // Mutable
    val answersM = mutableSetOf<Int>(3, 5, 8, 5)
    answersM.add(15)
    answersM.remove(3)
}