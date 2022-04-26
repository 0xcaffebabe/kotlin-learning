package classesobj

// 所有类默认都继承了Any
class Void

// 使用open代表该类开放继承
open class Base

fun main(){
    println(Void() is Any)
}