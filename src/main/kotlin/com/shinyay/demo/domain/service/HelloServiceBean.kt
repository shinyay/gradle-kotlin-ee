package com.shinyay.demo.domain.service

import javax.ejb.Stateless

@Stateless
class HelloServiceBean {
    fun sayHello(caller: String): String {
        println("[HelloServiceBean]")
        return "Hello, $caller"
    }
}