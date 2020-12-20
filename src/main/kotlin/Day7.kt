import org.jgrapht.graph.DefaultEdge
import org.jgrapht.graph.SimpleDirectedGraph
import org.jgrapht.traverse.DepthFirstIterator

// https://adventofcode.com/2020/day/7

private typealias NestedBag = Pair<String, Int>

fun main() {
    val bags = parseInput()
    part1(bags)
    part2(bags)
}

private fun part1(bags: Map<String, Set<NestedBag>>) {
    // Graph arrows: source node is INSIDE OF target node
    val graph = SimpleDirectedGraph<String, DefaultEdge>(DefaultEdge::class.java)

    bags.keys.forEach(graph::addVertex)

    bags.forEach { (name, innerBags) ->
        innerBags.forEach {
            graph.addEdge(it.first, name)
        }
    }

    var count = -1
    DepthFirstIterator(graph, "shiny gold").forEach { _ ->
        ++count
    }
    println("$count bag colours can eventually contain at least one shiny gold bag.")
}

private fun part2(bags: Map<String, Set<NestedBag>>) {
    fun countBags(which: String): Int = bags.getValue(which)
        .sumBy { it.second + (it.second * countBags(it.first)) }

    val result = countBags("shiny gold")
    println("$result individual bags are required inside a single shiny gold bag.")
}

private fun parseInput(): Map<String, Set<NestedBag>> {
    val rules = loadTextResource("day7.txt")
    val bags = mutableMapOf<String, Set<NestedBag>>()

    rules.forEach { rule ->
        val x = rule.replace(".", "").split(" bags contain ")
        val name = x.first()
        val stuff = x[1].split(", ")
            .map { it.replace("""bag(s)?""".toRegex(), "") }
            .map { it.trim() }
            .filter { it != "no other" }
            .map {
                it.dropWhile { it.isDigit() }.trim() to
                        it.takeWhile { it.isDigit() }.toInt()
            }

        bags[name] = stuff.toSet()
    }

    return bags
}