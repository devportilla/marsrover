data class Commands(private val commands: List<Command>) {
    fun execute(block: (Command) -> Unit) {
        commands.forEach { block.invoke(it) }
    }
}
