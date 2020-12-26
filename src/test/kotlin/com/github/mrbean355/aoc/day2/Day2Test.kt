package com.github.mrbean355.aoc.day2

import com.github.mrbean355.aoc.testing.PuzzleTest

class Day2Test : PuzzleTest(Day2::class) {

    override val part1TestCases = mapOf(
        "day2/example.txt" to 2L,
        "day2/puzzle.txt" to 500L,
    )

    override val part2TestCases = mapOf(
        "day2/example.txt" to 1L,
        "day2/puzzle.txt" to 313L,
    )
}