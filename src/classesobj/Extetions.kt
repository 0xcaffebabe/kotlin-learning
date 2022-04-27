package classesobj

// 一个类扩展新功能而无需继承该类或者使用像装饰者这样的设计模式
// 扩展一个类的函数
fun MutableList<Int>.print(){
    for(i in this) {
        println(i)
    }
}
fun String?.topPinyin(): String {
    if (this == null) return "null"
    return toString()
}
// 扩展属性
val String.Int: Int
    get() = this.toInt()
fun main() {
    // 调用的具体方法是由函数调用所在的表达式的类型来决定的
    mutableListOf(1,2,3,4).print()

    var s: String? = null
    println(s.topPinyin())

    println("1".Int)
}
