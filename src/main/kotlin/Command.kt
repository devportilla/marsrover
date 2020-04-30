enum class Command {
    M,
    L,
    R,
    NOOP;

    companion object {
        fun fromChar(command: Char): Command {
            return when (command) {
                'M' -> M
                'R' -> R
                'L' -> L
                else -> NOOP
            }
        }
    }
}
