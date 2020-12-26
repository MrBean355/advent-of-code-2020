package com.github.mrbean355.aoc.day20

import com.github.mrbean355.aoc.testing.PuzzleTest

class Day20Test : PuzzleTest(Day20::class) {

    override val part1TestCases = mapOf(
        "day20/example.txt" to 20_899_048_083_289L,
        "day20/puzzle.txt" to 14_129_524_957_217L,
    )

    override val part2TestCases = emptyMap<String, Long>()
}