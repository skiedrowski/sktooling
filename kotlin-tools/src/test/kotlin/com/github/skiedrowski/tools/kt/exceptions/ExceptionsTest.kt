package com.github.skiedrowski.tools.kt.exceptions

import io.kotest.matchers.string.shouldContain
import org.junit.jupiter.api.Test

class ExceptionsTest {
    @Test
    fun stackTraceString() {
        val stackTraceString = NullPointerException().stackTraceString()

        stackTraceString shouldContain "java.lang.NullPointerException"
        stackTraceString shouldContain "com.github.skiedrowski.tools.kt.exceptions.ExceptionsTest.stackTraceString"
    }

}