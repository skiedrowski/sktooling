@file:kotlin.jvm.JvmName("ExceptionsKt")

package com.github.skiedrowski.tools.kt.exceptions

import java.io.PrintWriter
import java.io.StringWriter

fun Throwable.stackTraceString(): String {
    val sw = StringWriter()
    this.printStackTrace(PrintWriter(sw))
    return sw.toString()
}
