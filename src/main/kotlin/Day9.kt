// https://adventofcode.com/2020/day/9

private const val PREAMBLE_SIZE = 25

fun main() {
    val numbers = loadTextResource("day9.txt")
        .map { it.toLong() }

    val invalid = numbers.findInvalidEntry()
    println("Invalid entry: $invalid")
    println("Weakness: ${numbers.findWeakness(invalid)}")
}

private fun List<Long>.findInvalidEntry(): Long {
    for (i in PREAMBLE_SIZE until size) {
        val preamble = subList(i - PREAMBLE_SIZE, i)
        val target = get(i)
        var found = false

        outer@ for (j in 0 until PREAMBLE_SIZE - 1) {
            for (k in j until PREAMBLE_SIZE) {
                if (preamble[j] + preamble[k] == target) {
                    found = true
                    break@outer
                }
            }
        }

        if (!found) {
            return target
        }
    }
    error("No invalid entry found")
}

private fun List<Long>.findWeakness(entry: Long): Long {
    for (i in indices) {
        val taken = mutableListOf<Long>()
        for (j in i until size) {
            taken += get(j)
            val sum = taken.sum()
            if (sum == entry && taken.size > 1) {
                return taken.minOrNull()!! + taken.maxOrNull()!!
            } else if (sum > entry) {
                break
            }
        }
    }
    error("No weakness found")
}