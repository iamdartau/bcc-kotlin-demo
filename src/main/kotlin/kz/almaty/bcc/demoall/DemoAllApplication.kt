package kz.almaty.bcc.demoall

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DemoAllApplication

fun main(args: Array<String>) {
    runApplication<DemoAllApplication>(*args)
//    print(User())
//    User().showInfo(variable = 5, const = 5)
    /*User().iterate()
    val user = User()
    println(user.age)
    user.name

    println(user.min(1, 2))
    val user1 = User()
    user1.defArgs()
    val sumOfvargs = user1.varagsFun(1, 2, 3, 4, 5)[0] + user1.varagsFun(1, 2, 3, 4, 5)[2]
    user1.varagsFun(1, 2, 3, 4, 5, 6).forEach { e -> print(e) }
    user1.varagsFun(*intArrayOf(1, 2, 3, 4), 5, 6)
//
    var v: String? = null
    println(v?.length)
    v = "kotlin"
    println(v.length)
//
    var elvis: String? = "the king"
    println(elvis?.length ?: -1)
    elvis = null
    println(elvis?.length ?: -1)
//
//     wait NPE
//     !! allow us to have it
    var thereIsNull: String? = null
    thereIsNull = if ((0..10).random() > 9) "not null" else null
    println(thereIsNull!!.length)
    val user2 = User()
    user2.whenOperator(1)
    user2.whenOperator("1")
    user2.whenOperator(1.0)
    user2.lambdaForUser()*/

    /*fun joinOptions(options: Collection<String>){
        options.joinToString (
            separator =  ", ",
            prefix = "",
            postfix= "", )
    }*/

}
