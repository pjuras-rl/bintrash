package com.bintrash

import java.io.File

fun main() {
    val lines = File("binders_by_event_type.csv").readLines()
    val completedBinders = lines.map { Pair(it.split(",")[0], it.split(",")[1]) }
        .filter { it.second == "\"SIGN_API_BINDER_COMPLETED\"" }
        .map { it.first }
        .map { it.split("\"")[1] }
        .distinct()

    val bindersToRemove = File("binders_with_test_emails.csv").readLines()
        .map { it.split("\"")[1] }
        .distinct()

    val s: String? = null

    s?.toUpperCase()?.toLowerCase()?.toLong() ?: throw RuntimeException("asdasd")

    val bufferedWriter = File("result.csv").bufferedWriter()
    (completedBinders - bindersToRemove).forEach { bufferedWriter.write("$it\n") }
    bufferedWriter.flush()
    bufferedWriter.close()
}

data class A(val x: B)

data class B(val x: Int)