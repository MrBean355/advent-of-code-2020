package com.github.mrbean355.aoc.day22

class Player(
    val id: Int,
    val deck: MutableList<Int>
)

fun parseInput(input: List<String>): Pair<Player, Player> {
    val players = mutableListOf<Player>()
    var i = 0

    while (i < input.size) {
        val id = input[i].substringAfter("Player ").substringBefore(':').toInt()
        val lines = mutableListOf<Int>()
        ++i

        while (i < input.size && input[i].isNotBlank()) {
            lines += input[i].toInt()
            ++i
        }
        players += Player(id, lines)
        ++i
    }

    check(players.size == 2) { "Expected 2 players, got ${players.size}" }
    return players[0] to players[1]
}