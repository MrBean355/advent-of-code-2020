package com.github.mrbean355.aoc.day12

import com.github.mrbean355.aoc.testing.PuzzleTest

class Day12Test : PuzzleTest(Day12::class) {

    override val part1TestCases = mapOf(
        "day12/example.txt" to 25L,
        "day12/puzzle.txt" to 1631L,
    )

    override val part2TestCases = mapOf(
        "day12/example.txt" to 286L,
        "day12/puzzle.txt" to 58606L,
    )
}