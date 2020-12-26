package com.github.mrbean355.aoc.day4

import com.github.mrbean355.aoc.testing.PuzzleTest

class Day4Test : PuzzleTest(Day4::class) {

    override val part1TestCases = mapOf(
        "day4/part1_example.txt" to 2L,
        "day4/puzzle.txt" to 230L,
    )

    override val part2TestCases = mapOf(
        "day4/part2_example1.txt" to 0L,
        "day4/part2_example2.txt" to 4L,
        "day4/puzzle.txt" to 156L,
    )
}