import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class RoverTest {

    @Test
    fun it_should_return_current_position() {
        val rover = Rover()
        val actual = rover.execute("abc\n0 0 N\nfeg")
        assertEquals("0 0 N", actual)
    }

    @Test
    fun it_should_move_one_square_upwards() {
        val rover = Rover()
        val actual = rover.execute("abc\n0 0 N\nM")
        assertEquals("0 1 N", actual)
    }

    @Test
    fun it_should_move_one_square_to_the_right() {
        val rover = Rover()
        val actual = rover.execute("abc\n0 0 E\nM")
        assertEquals("1 0 E", actual)
    }

    @Test
    fun it_should_move_one_square_to_the_left() {
        val rover = Rover()
        val actual = rover.execute("abc\n1 0 W\nM")
        assertEquals("0 0 W", actual)
    }

    @Test
    fun it_should_move_one_square_to_the_bottom() {
        val rover = Rover()
        val actual = rover.execute("abc\n0 1 S\nM")
        assertEquals("0 0 S", actual)
    }

    @Test
    fun it_should_rotate_from_north_to_west() {
        val rover = Rover()
        val actual = rover.execute("abc\n0 0 N\nL")
        assertEquals("0 0 W", actual)
    }

    @Test
    fun it_should_rotate_from_west_to_south() {
        val rover = Rover()
        val actual = rover.execute("abc\n0 0 W\nL")
        assertEquals("0 0 S", actual)
    }

    @Test
    fun it_should_rotate_from_south_to_east() {
        val rover = Rover()
        val actual = rover.execute("abc\n0 0 S\nL")
        assertEquals("0 0 E", actual)
    }

    @Test
    fun it_should_rotate_from_east_to_north() {
        val rover = Rover()
        val actual = rover.execute("abc\n0 0 E\nL")
        assertEquals("0 0 N", actual)
    }

    @Test
    fun it_should_rotate_from_north_to_east() {
        val rover = Rover()
        val actual = rover.execute("abc\n0 0 N\nR")
        assertEquals("0 0 E", actual)
    }

    @Test
    fun it_should_rotate_from_east_to_south() {
        val rover = Rover()
        val actual = rover.execute("abc\n0 0 E\nR")
        assertEquals("0 0 S", actual)
    }

    @Test
    fun it_should_rotate_from_south_to_west() {
        val rover = Rover()
        val actual = rover.execute("abc\n0 0 S\nR")
        assertEquals("0 0 W", actual)
    }

    @Test
    fun it_should_rotate_from_west_to_north() {
        val rover = Rover()
        val actual = rover.execute("abc\n0 0 W\nR")
        assertEquals("0 0 N", actual)
    }

    @Test
    fun it_should_rotate_twice() {
        val rover = Rover()
        val actual = rover.execute("abc\n0 0 N\nRR")
        assertEquals("0 0 S", actual)
    }

    @Test
    fun it_should_do_full_route() {
        val rover = Rover()
        val actual = rover.execute("5 5\n1 2 N\nLMLMLMLMM")
        assertEquals("1 3 N", actual)
    }
}
