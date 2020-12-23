package com.github.mrbean355.aoc

import com.github.mrbean355.aoc.base.loadTextResource
import kotlin.math.PI
import kotlin.math.absoluteValue
import kotlin.math.cos
import kotlin.math.round
import kotlin.math.sin

fun main() {
    val input = loadTextResource("day12.txt")
    val directions = input.map {
        NavInstruction(it.first(), it.substring(1).toInt())
    }

    directions.part1()
    directions.part2()
}

private fun List<NavInstruction>.part1() {
    val ship = Ship()
    forEach {
        when (it.command) {
            'N' -> ship.y += it.amount
            'S' -> ship.y -= it.amount
            'E' -> ship.x += it.amount
            'W' -> ship.x -= it.amount
            'L' -> ship.facing += it.amount
            'R' -> ship.facing -= it.amount
            'F' -> ship.forward(it.amount)
        }
    }
    println("Part 1: ${ship.x.absoluteValue + ship.y.absoluteValue}")
}

private fun List<NavInstruction>.part2() {
    var shipX = 0
    var shipY = 0
    var markerX = 10
    var markerY = 1

    forEach { instruction ->
        when (instruction.command) {
            'N' -> markerY += instruction.amount
            'S' -> markerY -= instruction.amount
            'E' -> markerX += instruction.amount
            'W' -> markerX -= instruction.amount
            'L' -> {
                val (nx, ny) = translate(markerX, markerY, shipX, shipY, instruction.amount)
                markerX = nx
                markerY = ny
            }
            'R' -> {
                val (nx, ny) = translate(markerX, markerY, shipX, shipY, -instruction.amount)
                markerX = nx
                markerY = ny
            }
            'F' -> {
                val xInc = markerX - shipX
                val yInc = markerY - shipY

                repeat(instruction.amount) {
                    shipX += xInc
                    shipY += yInc
                }

                markerX = shipX + xInc
                markerY = shipY + yInc
            }
        }
    }

    println("Part 2: ${shipX.absoluteValue + shipY.absoluteValue}")
}

fun translate(x: Int, y: Int, cx: Int, cy: Int, degrees: Int): Pair<Int, Int> {
    val rad = degrees * PI / 180.0
    val s = sin(rad)
    val c = cos(rad)

    val tx = x - cx
    val ty = y - cy

    val newX = tx * c - ty * s
    val newY = tx * s + ty * c

    return round(newX + cx).toInt() to round(newY + cy).toInt()
}

class NavInstruction(
    val command: Char,
    val amount: Int
)

class Ship(
    var x: Int = 0,
    var y: Int = 0
) {
    var facing: Int = 0

    fun forward(amount: Int) {
        var normalised = facing
        while (normalised < 0) {
            normalised += 360
        }
        when (normalised) {
            0 -> x += amount
            90 -> y += amount
            180 -> x -= amount
            270 -> y -= amount
            else -> {
                error("Unsupported direction: $facing")
            }
        }
    }

    override fun toString(): String {
        return "Ship(x=$x, y=$y, facing=$facing)"
    }
}