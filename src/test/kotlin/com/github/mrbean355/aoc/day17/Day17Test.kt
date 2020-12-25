package com.github.mrbean355.aoc.day17

import com.github.mrbean355.aoc.base.loadTextResource
import org.junit.Assert.assertEquals
import org.junit.Test

class Day17Test {

    @Test
    fun testPart1_Example() {
        val solution = Day17(loadTextResource("day17/part1_example.txt"))

        val result = solution.part1()

        assertEquals(112, result)
    }

    @Test
    fun testPart1_Puzzle() {
        val solution = Day17(loadTextResource("day17/puzzle.txt"))

        val result = solution.part1()

        assertEquals(295, result)
    }

    @Test
    fun testPart2_Example() {
        val solution = Day17(loadTextResource("day17/part2_example.txt"))

        val result = solution.part2()

        assertEquals(848, result)
    }

    @Test
    fun testPart2_Puzzle() {
        val solution = Day17(loadTextResource("day17/puzzle.txt"))

        val result = solution.part2()

        assertEquals(1972, result)
    }
}