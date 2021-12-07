// Interface
// It can inherit as many times as you want

interface Sharable {
    // abstract property
    val version: Double // not need "abstract

    // abstract method
    fun share()

    // normal method
    fun getInfo(){
        println("Share I/F $version")
    }
}

class User8: Sharable {
    override val version = 1.1
    override fun share() {
        println("Sharing...")
    }
}

fun main(args: Array<String>){
    val hideru = User8()
    hideru.share()
    hideru.getInfo()
}