package com.github.mrbean355.aoc.day15

import com.github.mrbean355.aoc.testing.PuzzleTest

class Day15Test : PuzzleTest(Day15::class) {

    override val part1TestCases = mapOf(
        "day15/part1_example1.txt" to 436L,
        "day15/part1_example2.txt" to 1L,
        "day15/part1_example3.txt" to 10L,
        "day15/part1_example4.txt" to 27L,
        "day15/part1_example5.txt" to 78L,
        "day15/part1_example6.txt" to 438L,
        "day15/part1_example7.txt" to 1836L,
        "day15/puzzle.txt" to 1428L,
    )

    override val part2TestCases = mapOf(
        "day15/puzzle.txt" to 0L,
    )
}