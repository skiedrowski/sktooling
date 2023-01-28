package com.github.skiedrowski.tools.kt.lang

import io.kotest.matchers.shouldNotBe
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import java.io.FileNotFoundException

class LangKtTest {

    @Test
    fun getResourceFile() {
        val resourceFile = LangKtTest::class.java.getResourceFile("LangKtTestResource.txt")
        resourceFile shouldNotBe null
    }

    @Test
    fun getResourceFileNonexistant() {
        assertThrows<FileNotFoundException> {
            LangKtTest::class.java.getResourceFile("LangKtTestResourceXXXXXX.txt")
        }
    }
}