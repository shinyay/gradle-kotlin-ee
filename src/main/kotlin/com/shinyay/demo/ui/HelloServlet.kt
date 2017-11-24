package com.shinyay.demo.ui

import javax.servlet.annotation.WebServlet
import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

@WebServlet(name = "Demo", value = "/servlet")
class HelloServlet : HttpServlet() {
    override fun doGet(req: HttpServletRequest?, resp: HttpServletResponse?) {
        println("[HelloServlet]")
        val text = """
      <html>
      <html><head><title>HelloServlet</title></head>
      <body><h1>Hello Servlet</h1></body>
      </html>
      """
        resp?.contentType = "text/html; charset=UTF-8"
        resp?.writer?.println(text)
    }
}