package com.github.mrbean355.aoc.day14

import com.github.mrbean355.aoc.testing.loadTextResource
import org.junit.Assert.assertEquals
import org.junit.Test

class Day14Test {

    @Test
    fun testPart1_Example() {
        val solution = Day14(loadTextResource("day14/part1_example.txt"))

        val result = solution.part1()

        assertEquals(165, result)
    }

    @Test
    fun testPart1_Puzzle() {
        val solution = Day14(loadTextResource("day14/puzzle.txt"))

        val result = solution.part1()

        assertEquals(14839536808842, result)
    }

    @Test
    fun testPart2_Example() {
        val solution = Day14(loadTextResource("day14/part2_example.txt"))

        val result = solution.part2()

        assertEquals(208, result)
    }

    @Test
    fun testPart2_Puzzle() {
        val solution = Day14(loadTextResource("day14/puzzle.txt"))

        val result = solution.part2()

        assertEquals(4215284199669, result)
    }
}