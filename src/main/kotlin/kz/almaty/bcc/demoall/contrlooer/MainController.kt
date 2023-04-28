package kz.almaty.bcc.demoall.contrlooer

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/")
class MainController {

    @GetMapping("/user/{id}")
    fun getString(): String{
        return "Hello, I'm Working"
    }

}