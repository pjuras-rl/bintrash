package com.bintrash

import com.github.kittinunf.fuel.Fuel
import kotlin.concurrent.thread

fun main() {
    (1..5).forEach {
        thread() {
            while (true) {
                try {
                    doTestUrls()
                } catch (e: Exception) {
//                    println("exception: ${e.localizedMessage}")
                }
            }
        }
    }
}

private fun doTestUrls() {
    val fakeAppResponse = Fuel.get("https://pjuras-fake-app.ip.cicdv2.dev.rktlyr.com/").response()
    val fakeAppHtml = fakeAppResponse.second.body().asString(null)
    val docManagerLink = extractDocManagerLink(fakeAppHtml)
    val (request, docManagerResponse, result) = Fuel.get(docManagerLink).response()
    val indexHtmlContent = docManagerResponse.body().asString(null)
    val resourcesLinks = extractResourcesLinks(indexHtmlContent).filter { it.contains("js") }
    resourcesLinks.forEach { link ->
        val (resouceRequest, resourceRespnse, resourceResult) = Fuel
            .get("https://pjuras-document-manager.ip.cicdv2.dev.rktlyr.com/$link")
            .response()
        if (resourceRespnse.statusCode > 399) {
            println("Received status code: ${resourceRespnse.statusCode}")
        }
    }
}

private fun extractResourcesLinks(indexHtmlContent: String): List<String> {
    val regex = Regex("(app/[^\"]*)")
    return regex.findAll(indexHtmlContent).toList().map { it.value }
}

private fun extractDocManagerLink(fakeAppHtml: String): String {
    val tag = fakeAppHtml.split("<iframe")[1].split("</iframe")[0]
    val link = tag.split("\"")[1]
    return link
}