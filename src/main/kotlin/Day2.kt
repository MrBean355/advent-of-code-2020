// https://adventofcode.com/2020/day/2

fun main() {
    val passwords = loadTextResource("day2.txt")
    println("Part 1: ${passwords.filter(::isValidPart1).size}")
    println("Part 2: ${passwords.filter(::isValidPart2).size}")
}

private fun isValidPart1(s: String): Boolean {
    val parts = s.split(' ')
    check(parts.size == 3) { "Invalid input: $s" }

    val lowerBound = parts.first().substringBefore('-').toInt()
    val upperBound = parts.first().substringAfter('-').toInt()
    val range = lowerBound..upperBound
    val char = parts[1].substringBefore(':').single()
    val password = parts[2]

    return password.count { it == char } in range
}

private fun isValidPart2(s: String): Boolean {
    val parts = s.split(' ')
    check(parts.size == 3) { "Invalid input: $s" }

    val pos1 = parts.first().substringBefore('-').toInt() - 1
    val pos2 = parts.first().substringAfter('-').toInt() - 1
    val char = parts[1].substringBefore(':').single()
    val password = parts[2]

    return (password[pos1] == char) xor (password[pos2] == char)
}