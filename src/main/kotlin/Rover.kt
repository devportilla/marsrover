class Rover {
    fun execute(input: String): String {
        val commands = InputParser().parseCommands(input)
        var position = InputParser().parsePosition(input)
        commands.execute {
            position = when (it) {
                Command.M -> position.move()
                Command.L -> position.rotateLeft()
                Command.R -> position.rotateRight()
                else -> position
            }
        }

        return "$position"
    }
}
