package com.github.mrbean355.aoc

import com.github.mrbean355.aoc.util.loadTextResource

fun main() {
    val instructions = loadTextResource("day8.txt")
        .map { it.toInstruction() }

    part1(instructions)
    part2(instructions)
}

private fun part1(instructions: List<Instruction>) {
    val result = instructions.evaluate()
    println("Part 1 accumulator = ${result.accumulator}")
}

// Could be further optimised.
// Currently every jmp/nop instruction is mutated, even ones that are never hit by the program.
// We could only mutate instructions as they are reached by the program.
private fun part2(instructions: List<Instruction>) {
    for (i in 0..instructions.size) {
        val instruction = instructions[i]
        val new = when (instruction.name) {
            "acc" -> continue
            "jmp" -> instruction.mutate("nop")
            "nop" -> instruction.mutate("jmp")
            else -> error("Unexpected instruction: ${instruction.name}")
        }
        val copy = instructions.toMutableList()
        copy[i] = new
        val result = copy.evaluate()
        if (!result.hasLoop) {
            println("Part 2 accumulator = ${result.accumulator}")
            break
        }
    }
}

private fun List<Instruction>.evaluate(): Evaluation {
    val executed = mutableSetOf<Int>()
    var acc = 0
    var pc = 0

    while (pc < size) {
        if (pc in executed) {
            return Evaluation(true, acc)
        }
        executed += pc
        val instruction = get(pc)
        when (instruction.name) {
            "nop" -> ++pc
            "acc" -> {
                acc += instruction.argument
                ++pc
            }
            "jmp" -> pc += instruction.argument
        }
    }

    return Evaluation(false, acc)
}

private class Instruction(
    val name: String,
    val argument: Int
)

private fun String.toInstruction(): Instruction =
    split(' ').run {
        Instruction(first(), get(1).toInt())
    }

private fun Instruction.mutate(newName: String): Instruction {
    return Instruction(newName, argument)
}

private class Evaluation(
    val hasLoop: Boolean,
    val accumulator: Int
)