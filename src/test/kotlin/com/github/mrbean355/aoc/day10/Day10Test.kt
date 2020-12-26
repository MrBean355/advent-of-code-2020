package com.github.mrbean355.aoc.day10

import com.github.mrbean355.aoc.testing.PuzzleTest

class Day10Test : PuzzleTest(Day10::class) {

    override val part1TestCases = mapOf(
        "day10/example1.txt" to 35L,
        "day10/example2.txt" to 220L,
        "day10/puzzle.txt" to 2574L,
    )

    override val part2TestCases = mapOf(
        "day10/example1.txt" to 8L,
        "day10/example2.txt" to 19208L,
        "day10/puzzle.txt" to 2644613988352L,
    )
}