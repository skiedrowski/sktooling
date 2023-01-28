package com.github.skiedrowski.tools.kt.hash

import java.math.BigInteger
import java.security.MessageDigest

/** A tool for hashing short strings */
class SHA256 {

    /**
     * Hash the given plaintext value using SHA-256 message digest.
     *
     * This method is currently only tested using quite short plaintexts. If the plaintext is longer (i.e. a whole
     * document), it may be better to revise this implementation (i.e. use `MessageDigest.update` per line of the
     * document).
     *
     * The conversion algorithm used matches the results given on various wikipedia pages (see [HashToolTest] for
     * details).
     */
    fun hash(salt: String, plaintext: String): String {
        val md: MessageDigest = MessageDigest.getInstance("SHA-256")
        md.reset()
        if (salt.isNotEmpty()) {
            md.update(salt.toByteArray())
        }
        md.update(plaintext.toByteArray())

        val raw = md.digest()
        return String.format("%064x", BigInteger(1, raw))
    }
}
