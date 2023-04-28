package kz.almaty.bcc.demoall

import kz.almaty.bcc.demoall.domain.model.JavaUser
import kz.almaty.bcc.demoall.domain.model.User
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DemoAllApplication

fun main(args: Array<String>) {
    runApplication<DemoAllApplication>(*args)
//    println("hello Kotlin")
//    User().iterate()
//    User().showInfo()
//    val user = User()
//    println(user.age)
//    println(user.min(1, 2))
    val user1 = User()
    user1.defArgs()
}
