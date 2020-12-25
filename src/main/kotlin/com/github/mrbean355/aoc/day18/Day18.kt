package com.github.mrbean355.aoc.day18

import com.github.mrbean355.aoc.base.Puzzle

class Day18(private val input: List<String>) : Puzzle {

    override fun part1(): Long {
        return input.sumOf(::evaluateExpression)
    }

    override fun part2(): Long {
        TODO("Not yet implemented")
    }
}