package com.github.mrbean355.aoc.day1

import com.github.mrbean355.aoc.testing.PuzzleTest

class Day1Test : PuzzleTest(Day1::class) {

    override val part1TestCases = mapOf(
        "day1/example.txt" to 514579L,
        "day1/puzzle.txt" to 388075L,
    )

    override val part2TestCases = mapOf(
        "day1/example.txt" to 241861950L,
        "day1/puzzle.txt" to 293450526L,
    )
}