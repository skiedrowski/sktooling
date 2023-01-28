package com.github.skiedrowski.tools.kt.lang

import java.io.File
import java.io.FileNotFoundException

fun Class<*>.getResourceFile(resourceFilePath: String): File {
    val exampleLogsUrl = getResource(resourceFilePath) ?: throw FileNotFoundException("file not found $resourceFilePath")
    val schemeSpecificPart = exampleLogsUrl.toURI().schemeSpecificPart!!
    return File(schemeSpecificPart)
}