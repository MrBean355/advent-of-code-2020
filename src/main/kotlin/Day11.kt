// https://adventofcode.com/2020/day/11

fun main() {
    val seats = loadTextResource("day11.txt")
        .map { it.toList() }

    seats.part1()
    seats.part2()
}

private fun List<List<Char>>.part1() {
    val occupiedSeats = runSimulation(tolerance = 3, limited = true)
    println("Part 1: $occupiedSeats")
}

private fun List<List<Char>>.part2() {
    val occupiedSeats = runSimulation(tolerance = 4, limited = false)
    println("Part 2: $occupiedSeats")
}

/**
 * @param tolerance max number of visible occupied seats before becoming empty.
 * @param limited whether to only look at adjacent seats.
 * @return number of occupied seats when the simulation ends.
 */
private fun List<List<Char>>.runSimulation(tolerance: Int, limited: Boolean): Int {
    var seats = this
    var iterations = 0

    while (true) {
        val next = seats.iterate(tolerance, limited)
        ++iterations
        if (next == seats) {
            break
        }
        seats = next
    }

    return seats.flatten().count { it.isOccupied() }
}

private fun List<List<Char>>.iterate(tolerance: Int, limited: Boolean): List<List<Char>> {
    val output = mutableListOf<List<Char>>()
    indices.forEach { y ->
        val col = get(y)
        val row = mutableListOf<Char>()
        col.indices.forEach { x ->
            val count = countOccupiedSeats(y, x, limited)
            row += when (col[x]) {
                'L' -> if (count == 0) '#' else 'L'
                '#' -> if (count > tolerance) 'L' else '#'
                '.' -> '.'
                else -> error("Unexpected character: ${col[x]}")
            }
        }
        output += row
    }
    return output
}

private class Operation(
    val deltaY: Int,
    val deltaX: Int
)

private val operations = listOf(
    Operation(1, 0),
    Operation(-1, 0),
    Operation(0, 1),
    Operation(0, -1),
    Operation(1, -1),
    Operation(-1, 1),
    Operation(1, 1),
    Operation(-1, -1),
)

private fun List<List<Char>>.countOccupiedSeats(y: Int, x: Int, limited: Boolean): Int {
    val yRange = indices
    val xRange = first().indices
    var count = 0

    operations.forEach { op ->
        var cy = y + op.deltaY
        var cx = x + op.deltaX

        while (cy in yRange && cx in xRange) {
            val ch = get(cy)[cx]
            if (ch.isSeat()) {
                if (ch.isOccupied()) {
                    ++count
                }
                break
            }
            if (limited) {
                break
            }
            cy += op.deltaY
            cx += op.deltaX
        }
    }

    return count
}

private fun Char.isSeat(): Boolean = this == 'L' || this == '#'
private fun Char.isOccupied(): Boolean = this == '#'
