package classesobj

// 会根据构造函数自动生成equals/hashCode/toString/copy
data class User(val name: String, val age: Int)

fun main() {
    val cxk = User("cxk", 18)
    val olderCxk = cxk.copy(age = 22)
    println(cxk == olderCxk)
    // 解构
    val (name, age) = cxk
    println("${name},${age}")
}