data class Position(private val coordinate: Coordinate, private val facing: String) {
    fun rotateLeft(): Position {
        return when (facing) {
            "N" -> copy(coordinate = coordinate, facing = "W")
            "W" -> copy(coordinate = coordinate, facing = "S")
            "S" -> copy(coordinate = coordinate, facing = "E")
            else -> copy(coordinate = coordinate, facing = "N")
        }
    }

    fun rotateRight(): Position {
        return when (facing) {
            "N" -> copy(coordinate = coordinate, facing = "E")
            "E" -> copy(coordinate = coordinate, facing = "S")
            "S" -> copy(coordinate = coordinate, facing = "W")
            else -> copy(coordinate = coordinate, facing = "N")
        }
    }

    fun move(): Position {
        return when (facing) {
            "N" -> copy(coordinate = coordinate.incrementY(), facing = facing)
            "E" -> copy(coordinate = coordinate.incrementX(), facing = facing)
            "W" -> copy(coordinate = coordinate.decrementX(), facing = facing)
            else -> copy(coordinate = coordinate.decrementY(), facing = facing)
        }
    }

    override fun toString(): String {
        return "$coordinate $facing"
    }
}
