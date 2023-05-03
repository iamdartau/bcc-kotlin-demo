package kz.almaty.bcc.demoall.domain.models

class JavaUser {
    var name: String? = null
    var age: Int? = null
    var alive: Boolean? = null

    constructor(name: String?, age: Int?) {
        this.name = name
        this.age = age
    }

    constructor()
    constructor(name: String?, age: Int?, alive: Boolean?) {
        this.name = name
        this.age = age
        this.alive = alive
    }
}