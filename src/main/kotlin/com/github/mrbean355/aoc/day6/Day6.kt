package com.github.mrbean355.aoc.day6

import com.github.mrbean355.aoc.base.Puzzle

class Day6(input: List<String>) : Puzzle {

    private val groups = parseInput(input)
    private val answers = "abcdefghijklmnopqrstuvwxyz".toList()

    override fun part1(): Int {
        return groups.sumBy { members ->
            answers.count { answer ->
                members.any {
                    answer in it
                }
            }
        }
    }

    override fun part2(): Int {
        return groups.sumBy { members ->
            answers.count { answer ->
                members.all {
                    answer in it
                }
            }
        }
    }

    private fun parseInput(input: List<String>): List<List<List<Char>>> {
        val result = mutableListOf<List<List<Char>>>()
        var group = mutableListOf<List<Char>>()

        for (line in input) {
            if (line.isBlank()) {
                result += group
                group = mutableListOf()
                continue
            }
            group.add(line.toList())
        }
        result += group

        return result
    }
}