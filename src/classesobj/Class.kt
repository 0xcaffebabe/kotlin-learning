package classesobj

// 空类
class Empty

class Person(name: String) {
    var innerName: String = name.uppercase()
    init {
        println("init code block ${innerName}")
    }
}

// 如果构造器有修饰符或者注解 则需要constructor关键字
class Animal protected constructor(){}

class Pet(owner: String) {
    // 次构造函数 将工作委托给主构造函数
    constructor(): this("cxk")
}

// 抽象类
open class Remote {
    open fun execute(){}
}
abstract class BaseRemote: Remote() {
    // 一个抽象成员覆盖一个非抽象的开放成员
    abstract override fun execute()
}
class WarnRemote: BaseRemote(){
    override fun execute() {
        TODO("Not yet implemented")
    }
}

fun main(){
    Person("cxk")
}
