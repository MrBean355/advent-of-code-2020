package com.github.mrbean355.aoc.day18

import com.github.mrbean355.aoc.testing.loadTextResource
import org.junit.Assert.assertEquals
import org.junit.Test

class Day18Test {

    @Test
    fun testPart1_Example1() {
        val solution = Day18(loadTextResource("day18/part1_example1.txt"))

        val result = solution.part1()

        assertEquals(71, result)
    }

    @Test
    fun testPart1_Example2() {
        val solution = Day18(loadTextResource("day18/part1_example2.txt"))

        val result = solution.part1()

        assertEquals(51, result)
    }

    @Test
    fun testPart1_Example3() {
        val solution = Day18(loadTextResource("day18/part1_example3.txt"))

        val result = solution.part1()

        assertEquals(26, result)
    }

    @Test
    fun testPart1_Example4() {
        val solution = Day18(loadTextResource("day18/part1_example4.txt"))

        val result = solution.part1()

        assertEquals(437, result)
    }

    @Test
    fun testPart1_Example5() {
        val solution = Day18(loadTextResource("day18/part1_example5.txt"))

        val result = solution.part1()

        assertEquals(12240, result)
    }

    @Test
    fun testPart1_Example6() {
        val solution = Day18(loadTextResource("day18/part1_example6.txt"))

        val result = solution.part1()

        assertEquals(13632, result)
    }

    @Test
    fun testPart1_Puzzle() {
        val solution = Day18(loadTextResource("day18/puzzle.txt"))

        val result = solution.part1()

        assertEquals(11297104473091, result)
    }

    @Test
    fun testPart2_Example1() {
        val solution = Day18(loadTextResource("day18/part2_example1.txt"))

        val result = solution.part2()

        assertEquals(231, result)
    }

    @Test
    fun testPart2_Example2() {
        val solution = Day18(loadTextResource("day18/part2_example2.txt"))

        val result = solution.part2()

        assertEquals(51, result)
    }

    @Test
    fun testPart2_Example3() {
        val solution = Day18(loadTextResource("day18/part2_example3.txt"))

        val result = solution.part2()

        assertEquals(46, result)
    }

    @Test
    fun testPart2_Example4() {
        val solution = Day18(loadTextResource("day18/part2_example4.txt"))

        val result = solution.part2()

        assertEquals(1445, result)
    }

    @Test
    fun testPart2_Example5() {
        val solution = Day18(loadTextResource("day18/part2_example5.txt"))

        val result = solution.part2()

        assertEquals(669060, result)
    }

    @Test
    fun testPart2_Example6() {
        val solution = Day18(loadTextResource("day18/part2_example6.txt"))

        val result = solution.part2()

        assertEquals(23340, result)
    }

    @Test
    fun testPart2_Puzzle() {
        val solution = Day18(loadTextResource("day18/puzzle.txt"))

        val result = solution.part2()

        assertEquals(185348874183674, result)
    }
}