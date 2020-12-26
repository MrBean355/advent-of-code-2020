package com.github.mrbean355.aoc.day13

import com.github.mrbean355.aoc.testing.PuzzleTest

class Day13Test : PuzzleTest(Day13::class) {

    override val part1TestCases = mapOf(
        "day13/example.txt" to 295L,
        "day13/puzzle.txt" to 171L,
    )

    override val part2TestCases = mapOf(
        "day13/example.txt" to 1068781L,
        "day13/part2_example2.txt" to 3417L,
        "day13/part2_example3.txt" to 754018L,
        "day13/part2_example4.txt" to 779210L,
        "day13/part2_example5.txt" to 1261476L,
        "day13/part2_example6.txt" to 1202161486L,
        // "day13/puzzle.txt" to 0L, // FIXME: takes too long, find a better solution
    )

}