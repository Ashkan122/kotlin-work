// Task 3.1: command line arguments

import kotlin.system.exitProcess
fun main(args: Array<String>) {
    if (args.isEmpty()) {
        println("No arguments provided.")
        exitProcess(1)
    }
    if (args.size < 2) {
        println("Please provide at least two arguments.")
        exitProcess(1)
    }
    println("First argument: ${args[0]}")
    println("Second argument: ${args[1]}")
}

