val animals = arrayOf(camel, lion, deer, goose, bat, rabbit)

fun main() {
    // write yor code here
    while (true) {
        print("Please enter the number of the habitat you would like to view: > ")
        val input = readLine()!!
        if (input == "exit") {
            println("See you later!")
            break
        } else {
            val index = input.toInt()
            println()
            val animal = animals[index]
            println(animal)
        }
    }
}