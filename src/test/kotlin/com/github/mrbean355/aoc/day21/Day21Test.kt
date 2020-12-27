package com.github.mrbean355.aoc.day21

import com.github.mrbean355.aoc.testing.PuzzleTest

class Day21Test : PuzzleTest(Day21::class) {

    override val part1TestCases = mapOf(
        "day21/example.txt" to 5L,
        "day21/puzzle.txt" to 1685L,
    )

    override val part2TestCases = mapOf(
        "day21/example.txt" to "mxmxvkd,sqjhc,fvjkl",
        "day21/puzzle.txt" to "ntft,nhx,kfxr,xmhsbd,rrjb,xzhxj,chbtp,cqvc",
    )
}