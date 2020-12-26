package com.github.mrbean355.aoc.testing

import com.github.mrbean355.aoc.base.Puzzle
import org.junit.Assert.assertEquals
import org.junit.Test
import kotlin.reflect.KClass
import kotlin.reflect.full.primaryConstructor

/**
 * Base test class to make unit testing puzzles easier.
 */
abstract class PuzzleTest(
    /** Type of the [Puzzle] implementation. */
    private val clazz: KClass<out Puzzle>
) {

    /** Map of input files to expected outputs. */
    abstract val part1TestCases: Map<String, Long>

    /** Map of input files to expected outputs. */
    abstract val part2TestCases: Map<String, Long>

    @Test
    fun runPart1TestCases() {
        part1TestCases.forEach { (input, expected) ->
            val solution = instantiate(input)

            val actual = solution.part1()

            assertEquals("Wrong output for $input:", expected, actual)
        }
    }

    @Test
    fun runPart2TestCases() {
        part2TestCases.forEach { (input, expected) ->
            val solution = instantiate(input)

            val actual = solution.part2()

            assertEquals("Wrong output for $input:", expected, actual)
        }
    }

    private fun instantiate(input: String): Puzzle {
        val constructor = clazz.primaryConstructor
            ?: error("Class $clazz must have a primary constructor that accepts only List<String>")

        return constructor.call(loadTextResource(input))
    }
}
