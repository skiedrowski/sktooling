package com.github.skiedrowski.tools.kt.hash

import io.kotest.assertions.withClue
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class SHA256HashTest {

    @Test
    fun hashPlaintext1() {
        checkSHA256(
            "Franz jagt im komplett verwahrlosten Taxi quer durch Bayern",
            "d32b568cd1b96d459e7291ebf4b25d007f275c9f13149beeb782fac0716613f8"
        )
    }

    @Test
    fun hashPlaintext2() {
        checkSHA256(
            "Frank jagt im komplett verwahrlosten Taxi quer durch Bayern",
            "78206a866dbb2bf017d8e34274aed01a8ce405b69d45db30bafa00f5eeed7d5e"
        )
    }

    @Test
    fun hashPlaintext3() {
        checkSHA256("", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855")
    }

    @Test
    fun hashPlaintext4() {
        checkSHA256(
            "The quick brown fox jumps over the lazy dog",
            "d7a8fbb307d7809469ca9abcb0082e4f8d5651e46d3cdb762d02d0bf37c9e592"
        )
    }

    @Test
    fun hashPlaintext5() {
        checkSHA256(
            "The quick brown fox jumps over the lazy dog.",
            "ef537f25c895bfa782526529a9b63d97aa631564d5d789c2b765448c8635fb6c"
        )
    }

    @Test
    fun hashPlaintextEmpty() {
        checkSHA256("", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855")
    }

    private fun checkSHA256(plaintext: String, expHash: String) {
        val sHA256 = SHA256()

        val hashEmptyStringSalt = sHA256.hash("", plaintext)
        withClue("with empty salt") {
            hashEmptyStringSalt shouldBe expHash
        }

        if (plaintext.length > 6) {
            val salt = plaintext.substring(0, 5)
            val plain = plaintext.substring(5)
            val hashWithSalt = sHA256.hash(salt, plain)
            //since the hash function just concatenates salt and plaintext, hashing the decomposed string results in the same hash 
            withClue("withSalt") {
                hashWithSalt shouldBe expHash
            }
        }
        expHash.length shouldBe 64
    }
}

