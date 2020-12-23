package com.github.mrbean355.aoc

import com.github.mrbean355.aoc.base.loadTextResource

fun main() {
    val joltages = loadTextResource("day10.txt")
        .map { it.toLong() }
        .plus(0)
        .sorted()
        .let { it.plus(it.last() + 3) }

    part1(joltages)
    part2(joltages)
}

private fun part1(joltages: List<Long>) {
    var diff1 = 0
    var diff3 = 0
    joltages.zipWithNext().forEach { (current, next) ->
        when (next - current) {
            1L -> ++diff1
            3L -> ++diff3
        }
    }
    println("Part 1: ${diff1 * diff3}")
}

private fun part2(joltages: List<Long>) {
    val outDegrees = mutableMapOf<Long, Long>(
        joltages.last() to 1
    )

    joltages.dropLast(1).reversed().forEach {
        val one = outDegrees[it + 1] ?: 0
        val two = outDegrees[it + 2] ?: 0
        val three = outDegrees[it + 3] ?: 0
        outDegrees[it] = one + two + three
    }

    println("Part 2: ${outDegrees[joltages.first()]}")
}