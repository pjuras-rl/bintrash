package com.bintrash

import java.nio.file.Files
import java.nio.file.Paths

data class DomainAndStatus(val domain: String, val status: String)
data class DomainAndStatusCounts(
    val domain: String,
    val pendingCount: Int,
    val viewedCount: Int,
    val invitedCount: Int
)

fun main() {
    val rows = Files.readAllLines(Paths.get("check2.txt")).asSequence()
        .filter { it.contains("VIEWED") || it.contains("INVITED") || it.contains("PENDING") }

    val partial = mutableMapOf<DomainAndStatus, Int>()

    rows.forEach { row ->
        val parts = row.split("|")
        val domain = parts[2].toLowerCase().trim()
        val status = parts[0].trim()
        val count = parts[1].trim().toInt()

        val domainAndStatus = DomainAndStatus(domain, status)
        if (partial.containsKey(domainAndStatus)) {
            partial[domainAndStatus] = partial[domainAndStatus]!! + count
        } else {
            partial[domainAndStatus] = count
        }
    }

    val result = partial.entries.groupBy { it.key.domain }
        .map {
            DomainAndStatusCounts(
                it.key,
                it.value.firstOrNull() { it.key.status == "PENDING" }?.value ?: 0,
                it.value.firstOrNull() { it.key.status == "VIEWED" }?.value ?: 0,
                it.value.firstOrNull() { it.key.status == "INVITED" }?.value ?: 0,
            )
        }

    val newBufferedWriter = Files.newBufferedWriter(Paths.get("result.csv"))
    result
        .sortedBy { it.invitedCount + it.viewedCount }
        .forEach { newBufferedWriter.write("${it.domain},${it.invitedCount},${it.viewedCount},${it.pendingCount}\n") }

    newBufferedWriter.close()

}