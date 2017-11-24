package com.shinyay.demo.ui

import javax.ws.rs.ApplicationPath
import javax.ws.rs.core.Application

@ApplicationPath("/api")
class HelloRestApplication : Application() {
    override fun getClasses(): MutableSet<Class<*>> = mutableSetOf(HelloResource::class.java)
}