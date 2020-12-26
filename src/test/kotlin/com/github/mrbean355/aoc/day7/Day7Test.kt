package com.github.mrbean355.aoc.day7

import com.github.mrbean355.aoc.testing.PuzzleTest

class Day7Test : PuzzleTest(Day7::class) {

    override val part1TestCases = mapOf(
        "day7/example.txt" to 4L,
        "day7/puzzle.txt" to 229L,
    )

    override val part2TestCases = mapOf(
        "day7/example.txt" to 32L,
        "day7/part2_example2.txt" to 126L,
        "day7/puzzle.txt" to 6683L,
    )
}