package kz.almaty.bcc.demoall.domain.model

class User {
    fun showInfo() {
        val const: Int = 1
        var variable : Int = 2
        println("sum is ${const + variable}")
    }

    fun iterate(){
        var unMutableList = listOf("apple", "melon", "mango") // we can't change it after init
        var mutableListOf = mutableListOf(1, 2, 3, 4, 5, 6)
        mutableListOf.add(7)
        println("unmutable list ${unMutableList} \nmutable list ${mutableListOf}")
        for (item in mutableListOf){
            println("${item + 10}")
        }
    }
}