// Task 4.7: finding the longest line in a file
fun main(args: Array<String>) {
    
    val list = mutablelistof()
    file("").forEachLine {
    var length=it.length
    list.add(length)
    println(length)
    }
}
