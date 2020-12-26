package com.github.mrbean355.aoc.day5

import com.github.mrbean355.aoc.testing.PuzzleTest

class Day5Test : PuzzleTest(Day5::class) {

    override val part1TestCases = mapOf(
        "day5/part1_example1.txt" to 357L,
        "day5/part1_example2.txt" to 567L,
        "day5/part1_example3.txt" to 119L,
        "day5/part1_example4.txt" to 820L,
        "day5/puzzle.txt" to 878L,
    )

    override val part2TestCases = mapOf(
        "day5/puzzle.txt" to 504L,
    )
}