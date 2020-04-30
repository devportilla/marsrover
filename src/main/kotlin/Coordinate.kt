data class Coordinate(private val x: Int, private val y: Int) {
    fun incrementX(): Coordinate {
        return copy(x = x + 1, y = y)
    }

    fun decrementX(): Coordinate {
        return copy(x = x - 1, y = y)
    }

    fun incrementY(): Coordinate {
        return copy(x = x, y = y + 1)
    }

    fun decrementY(): Coordinate {
        return copy(x = x, y = y - 1)
    }

    override fun toString(): String {
        return "$x $y"
    }
}
