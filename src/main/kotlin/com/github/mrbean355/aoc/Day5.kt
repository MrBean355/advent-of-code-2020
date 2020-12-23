package com.github.mrbean355.aoc

import com.github.mrbean355.aoc.base.loadTextResource

fun main() {
    val boardingPasses = loadTextResource("day5.txt")
        .map(String::decodeBoardingPass)
        .sorted()

    println("Highest seat ID: ${boardingPasses.last()}")
    println("Missing set ID: ${boardingPasses.findMissingSeat()}")
}

private fun String.decodeBoardingPass(): Int {
    check(length == 10) { "Invalid boarding pass: $this" }

    val row = take(7).findSeat(0..127)
    val col = takeLast(3).findSeat(0..7)

    return row * 8 + col
}

private fun String.findSeat(range: IntRange): Int {
    var start = range.first
    var end = range.last

    forEach {
        val mid = (start + end) / 2
        when (it) {
            'F', 'L' -> end = mid
            'B', 'R' -> start = mid + 1
            else -> error("Unexpected char: $it")
        }
    }

    if (start != end) {
        error("Couldn't find single entry")
    }

    return start
}

private fun List<Int>.findMissingSeat(): Int {
    for (i in 0 until size - 1) {
        val curr = get(i)
        val next = get(i + 1)

        if (curr != next - 1) {
            return curr + 1
        }
    }
    error("No missing seat found")
}