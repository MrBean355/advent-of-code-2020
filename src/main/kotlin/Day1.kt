// https://adventofcode.com/2020/day/1

fun main() {
    val values = loadTextResource("day1.txt")
        .map(String::toInt)
        .sorted()

    part1(values)
    part2(values)
}

private fun part1(values: List<Int>) {
    for (i in 0 until values.size - 1) {
        for (j in i + 1 until values.size) {
            val sum = values[i] + values[j]
            if (sum == 2020) {
                println("Part 1 solution found:")
                println("${values[i]} * ${values[j]} = ${values[i] * values[j]}")
                return
            }
            if (sum > 2020) {
                break
            }
        }
    }
    println("Nothing found for solution 1 :(")
}

private fun part2(values: List<Int>) {
    for (i in 0 until values.size - 2) {
        for (j in i + 1 until values.size - 1) {
            for (k in j + 1 until values.size - 2) {
                val sum = values[i] + values[j] + values[k]
                if (sum == 2020) {
                    println("Part 2 solution found:")
                    println("${values[i]} * ${values[j]} * ${values[k]} = ${values[i] * values[j] * values[k]}")
                    return
                }
                if (sum > 2020) {
                    break
                }
            }
        }
    }
    println("Nothing found for solution 2 :(")
}