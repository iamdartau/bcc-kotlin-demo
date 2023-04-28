package kz.almaty.bcc.demoall.domain.model

class User(var name: String, private var _age: Int) {

    constructor() : this("", 0)

    var age: Int
        get() = _age
        set(value) {
            _age = value
        }

    fun showInfo() {
        val const: Int = 1
        var variable: Int = 2
        println("sum is ${const + variable}")
    }

    fun iterate() {
        var unMutableList = listOf("apple", "melon", "mango") // we can't change it after init
        var mutableListOf = mutableListOf(1, 2, 3, 4, 5, 6)
        mutableListOf.add(7)
        println("unmutable list ${unMutableList} \nmutable list ${mutableListOf}")
        for (item in mutableListOf) {
            println("${item + 10}")
        }
        var x = 0
        println("while loop")
        while (x <= mutableListOf.size-1) {
            println("${mutableListOf.get(x)}")
            x++
        }
        while (x <= unMutableList.size) {
            println(unMutableList[x])
        }

        println(3 in 1..10) // returns true
    }

    fun abc(): String {
        return "abc"
    }

    fun sum(a: Int, b: Int): Int {
        return a + b
    }

    fun min(a: Int, b: Int): Int {
        return a - b
    }

    // make it more simple
    fun sum(a: Int, b: Int, c: Int) = a + b + c
//    fun sum(a: Int, b: Int, c: Int) : Int = a + b + c  /*alternative*/

    fun defArgs(x:Int = 1, y:Int = 2){
        println(x+y)
    }


    fun varagsFun(vararg number: Int): IntArray {
        number.forEach { e-> if(e%2==0) println(e)};
        return number
    }
}