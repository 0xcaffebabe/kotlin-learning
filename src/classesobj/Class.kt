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

// 使用open代表该类开放继承
open class Remote {
    open val url = "baidu.com"
    open fun execute(){}
}
// 抽象类
abstract class BaseRemote: Remote() {
    // 覆盖属性
    // 可以用一个 var 属性覆盖一个 val 属性，但反之则不行
    override val url = "google.com"
    // 一个抽象成员覆盖一个非抽象的开放成员
    abstract override fun execute()

    open fun wrapper(){
        println("BaseRemote wrapper")
    }
}

interface HTTP {
    fun wrapper(){
        println("HTTP wrapper")
    }
}

class WarnRemote: BaseRemote(), HTTP{
    override fun execute() {
        TODO("Not yet implemented")
    }
    override fun wrapper(){
        // 调用父类的方法
        super<BaseRemote>.wrapper();
        // 调用特定接口的方法
        super<HTTP>.wrapper();
        println("WarnRemote wrapper")
    }
}

fun main(){

}
