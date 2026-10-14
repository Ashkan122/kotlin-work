// Task 4.2: use of if and ranges
fun main() {
    println("FOOOD MENU\n (a)pizza \n(b)curry \n(c)noodles \n(d)tacos")
    println("choose one of the above a,b,c,d")
    val userin = readln().lowercase()
    val order = if (userin.length == 1 && userin[0] in 'a'..'d') {
        "Order accepted"
    } else {
        "Invalid choice!"
    }
    println(order)
}
