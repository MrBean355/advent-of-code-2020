package com.github.mrbean355.aoc.day9

import com.github.mrbean355.aoc.testing.PuzzleTest

class Day9Test : PuzzleTest(Day9::class) {

    override val part1TestCases = mapOf(
        "day9/example.txt" to 127L,
        "day9/puzzle.txt" to 70639851L,
    )

    override val part2TestCases = mapOf(
        "day9/example.txt" to 62L,
        "day9/puzzle.txt" to 8249240L,
    )
}