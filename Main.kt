fun main() {

    do {
        println("Please enter the Clantag or Groupname you want ( write quit to exit ):")
        val input = readLine()

        if (input != null)
            GenerateName.output(input)

    } while (input != "quit")

}