package com.github.mrbean355.aoc.day15

import com.github.mrbean355.aoc.testing.loadTextResource
import org.junit.Assert.assertEquals
import org.junit.Test

class Day15Test {

    @Test
    fun testPart1_Example1() {
        val solution = Day15(loadTextResource("day15/part1_example1.txt"))

        val result = solution.part1()

        assertEquals(436, result)
    }

    @Test
    fun testPart1_Example2() {
        val solution = Day15(loadTextResource("day15/part1_example2.txt"))

        val result = solution.part1()

        assertEquals(1, result)
    }

    @Test
    fun testPart1_Example3() {
        val solution = Day15(loadTextResource("day15/part1_example3.txt"))

        val result = solution.part1()

        assertEquals(10, result)
    }

    @Test
    fun testPart1_Example4() {
        val solution = Day15(loadTextResource("day15/part1_example4.txt"))

        val result = solution.part1()

        assertEquals(27, result)
    }

    @Test
    fun testPart1_Example5() {
        val solution = Day15(loadTextResource("day15/part1_example5.txt"))

        val result = solution.part1()

        assertEquals(78, result)
    }

    @Test
    fun testPart1_Example6() {
        val solution = Day15(loadTextResource("day15/part1_example6.txt"))

        val result = solution.part1()

        assertEquals(438, result)
    }

    @Test
    fun testPart1_Example7() {
        val solution = Day15(loadTextResource("day15/part1_example7.txt"))

        val result = solution.part1()

        assertEquals(1836, result)
    }

    @Test
    fun testPart1_Puzzle() {
        val solution = Day15(loadTextResource("day15/puzzle.txt"))

        val result = solution.part1()

        assertEquals(1428, result)
    }
}