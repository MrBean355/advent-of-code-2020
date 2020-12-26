package com.github.mrbean355.aoc.day21

import com.github.mrbean355.aoc.base.Puzzle

class Day21(input: List<String>) : Puzzle {

    private val allFood = parseInput(input)

    override fun part1(): Long {
        val safeIngredients = allFood.flatMap { it.ingredients }.toMutableSet()

        allFood.flatMap { it.allergens }.distinct().forEach { allergen ->
            val containingFood = allFood.filter { allergen in it.allergens }
            safeIngredients -= containingFood.fold(containingFood.first().ingredients.toSet()) { acc, item ->
                acc.intersect(item.ingredients)
            }
        }

        return allFood.sumBy { food ->
            food.ingredients.count { it in safeIngredients }
        }.toLong()
    }

    override fun part2(): Long {
        TODO("Not yet implemented")
    }
}

private class Food(
    val ingredients: List<String>,
    val allergens: List<String>
)

private fun parseInput(input: List<String>): List<Food> {
    return input.map { line ->
        val ingredients = line.substringBefore(" (")
            .split(" ")
        val allergens = line.substringAfter(" (contains ")
            .substringBefore(")")
            .split(", ")

        Food(ingredients, allergens)
    }
}