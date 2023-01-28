package com.github.skiedrowski.tools.rest.authentication.client

import com.github.skiedrowski.tools.test.rxMockk
import io.mockk.every
import io.mockk.verify
import org.junit.jupiter.api.Test
import jakarta.ws.rs.client.ClientRequestContext
import jakarta.ws.rs.core.MultivaluedMap

class HTTPBasicAuthenticatorTest {
    @Test
    fun `filter adds sensible Authorization header`() {
        checkAuthHeader("peter", "petersPassword", "Basic cGV0ZXI6cGV0ZXJzUGFzc3dvcmQ=")
    }

    @Test
    fun `filter adds sensible Authorization header for Print`() {
        checkAuthHeader("print", "meinKlartextPasswort", "Basic cHJpbnQ6bWVpbktsYXJ0ZXh0UGFzc3dvcnQ=")
    }

    @Test
    fun `filter adds sensible Authorization header 2`() {
        checkAuthHeader("S3", "hansS3-dummy", "Basic UzM6aGFuc1MzLWR1bW15")
        checkAuthHeader("S3", "hansS3-test", "Basic UzM6aGFuc1MzLXRlc3Q=")
    }

    private fun checkAuthHeader(username: String, password: String, expHeaderValue: String) {
        val authenticator = HTTPBasicAuthenticator(username, password)

        val headers = rxMockk<MultivaluedMap<String, Any>>()
        val requestContext = rxMockk<ClientRequestContext>()
        every { requestContext.headers } returns headers
        authenticator.filter(requestContext)

        verify { headers.add("Authorization", expHeaderValue) }
    }

}