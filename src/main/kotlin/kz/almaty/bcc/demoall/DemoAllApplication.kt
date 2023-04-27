package kz.almaty.bcc.demoall

import kz.almaty.bcc.demoall.domain.model.JavaUser
import kz.almaty.bcc.demoall.domain.model.User
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DemoAllApplication

fun main(args: Array<String>) {
    runApplication<DemoAllApplication>(*args)
    var ju =  JavaUser("name", 10);
    ju.name = "Kotlin"

}
