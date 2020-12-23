package com.github.mrbean355.aoc.base

import java.io.File

fun loadTextResource(name: String): List<String> {
    val res = Thread.currentThread().contextClassLoader.getResource(name)
    check(res != null) { "Couldn't load resource: $name" }
    return File(res.toURI()).readLines()
}