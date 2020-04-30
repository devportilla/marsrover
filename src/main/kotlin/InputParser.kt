class InputParser {
    fun parsePosition(input: String): Position {
        val roverPosition = input.split("\n")[1]
        val x = roverPosition.split(" ")[0].toInt()
        val y = roverPosition.split(" ")[1].toInt()
        val f = roverPosition.split(" ")[2]
        return Position(Coordinate(x, y), f)
    }

    fun parseCommands(input: String): Commands {
        return Commands(input.split("\n")[2].toCharArray().map { Command.fromChar(it) })
    }
}
