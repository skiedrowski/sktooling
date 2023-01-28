package com.github.skiedrowski.tools.rest.authentication.server

import com.github.skiedrowski.tools.rest.authentication.AuthenticationNotRequired
import jakarta.inject.Inject
import jakarta.ws.rs.container.DynamicFeature
import jakarta.ws.rs.container.ResourceInfo
import jakarta.ws.rs.core.FeatureContext
import jakarta.ws.rs.ext.Provider

@Provider
class AuthenticationFeature @Inject constructor(
        private val authenticationProvider: HTTPBasicAuthenticationProvider) : DynamicFeature {

    override fun configure(resourceInfo: ResourceInfo, context: FeatureContext) {
        val method = resourceInfo.resourceMethod
        if (!method.isAnnotationPresent(AuthenticationNotRequired::class.java)) {
            context.register(AuthenticationFilter(authenticationProvider))
        }
    }
}