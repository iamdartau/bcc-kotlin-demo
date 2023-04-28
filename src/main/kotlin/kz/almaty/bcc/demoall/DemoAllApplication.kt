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
//    val user1 = User()
//    user1.defArgs()
//    val sumOfvargs = user1.varagsFun(1, 2, 3, 4, 5)[0] + user1.varagsFun(1, 2, 3, 4, 5)[2]
//    user1.varagsFun(1,2,3,4,5,6).forEach { e -> print(e) }
//    user1.varagsFun(*intArrayOf(1,2,3,4),5,6)

//    var v : String? = null
//    println(v?.length)
//    v = "kotlin"
//    println(v.length)

//    var elvis: String? = "the king"
//    println(elvis?.length ?: -1)
//    elvis = null
//    println(elvis?.length ?: -1)

    // wait NPE
    // !! allow us to have it
//    var thereIsNull: String? = null
//    thereIsNull = if ((0..10).random() > 9) "not null" else null
//    println(thereIsNull!!.length)
//    val user2 = User()
//    user2.whenOperator(1)
//    user2.whenOperator("1")
//    user2.whenOperator(1.0)
//    user2.lambdaForUser()
}
