package com.github.mrbean355.aoc.day16

import com.github.mrbean355.aoc.base.loadTextResource
import org.junit.Assert.assertEquals
import org.junit.Test

class Day16Test {

    @Test
    fun testPart1_Example() {
        val solution = Day16(loadTextResource("day16/part1_example.txt"))

        val result = solution.part1()

        assertEquals(71, result)
    }

    @Test
    fun testPart1_Puzzle() {
        val solution = Day16(loadTextResource("day16/puzzle.txt"))

        val result = solution.part1()

        assertEquals(20231, result)
    }
}