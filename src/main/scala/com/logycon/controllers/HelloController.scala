package com.logycon.controllers

import org.springframework.web.bind.annotation.{GetMapping, RequestMapping, RestController}
import scala.beans.BeanProperty

@RestController
@RequestMapping(path = Array("/api/hello"))
class HelloController {

  @GetMapping( path = Array(""))
  def hello(): Greeting = Greeting("Hi there!")
}

case class Greeting(@BeanProperty message: String)
