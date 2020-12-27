package com.github.mrbean355.aoc.day22

import com.github.mrbean355.aoc.base.Puzzle

class Day22(input: List<String>) : Puzzle {

    private val players = parseInput(input)

    override fun part1(): Long {
        val (p1, p2) = players

        while (true) {
            val c1 = p1.deck.removeFirst()
            val c2 = p2.deck.removeFirst()

            check(p1 != p2) { "Can't handle a tie!" }

            if (c1 > c2) {
                p1.deck += c1
                p1.deck += c2
            } else {
                p2.deck += c2
                p2.deck += c1
            }

            if (p1.deck.isEmpty() || p2.deck.isEmpty()) {
                break
            }
        }

        val winner = if (p1.deck.isEmpty()) p2 else p1
        var factor = winner.deck.size.toLong()

        return winner.deck.sumOf {
            it * (factor--)
        }
    }

    override fun part2(): Long {
        TODO("Not yet implemented")
    }
}