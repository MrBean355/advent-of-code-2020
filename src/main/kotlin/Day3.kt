fun main() {
    val slope = loadTextResource("day3.txt")

    val product = slope.countTrees(right = 1, down = 1) *
            slope.countTrees(right = 3, down = 1) *
            slope.countTrees(right = 5, down = 1) *
            slope.countTrees(right = 7, down = 1) *
            slope.countTrees(right = 1, down = 2)

    println(product)
}

private fun List<String>.countTrees(right: Int, down: Int): Int {
    val xMax = first().length
    var x = 0
    var trees = 0

    for (y in 0 until size step down) {
        if (get(y)[x] == '#') {
            ++trees
        }
        x = (x + right) % xMax
    }

    return trees
}