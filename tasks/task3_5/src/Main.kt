// Task 3.5: simple file I/O

import kotlin.io.path.Path
import kotlin.io.path.appendText
import kotlin.io.path.readText
import kotlin.io.path.writeText

fun main() {
    val  filePath = Path("output.txt")
    filePath.writeText("Hello, World!")
    val content = filePath.readText()
    println(content)
    filePath.writeText("This is a new line.")
    var contentAfterWrite = filePath.readText()
    println("Content after writing:")
    println(contentAfterWrite)
    filePath.appendText("\nThis is a new line.")
    println("Content after appending:")
    println(filePath.readText())
}
