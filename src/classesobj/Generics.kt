package classesobj

import java.util.*

// 使用out T 来确保它仅从 成员中返回（生产），并从不被消费
// in T 则相反
class Wrapper<out T>(val data: T) {
    fun get(): T {
        return data
    }
    // 类型投影
    fun copy(from: Wrapper<out Any>, to: Wrapper<Any>){}
    // 星投影
    fun print(w: Wrapper<*>) {}
}

// 泛型函数
fun <T> singleList(t: T): List<T> {
    return Arrays.asList(t)
}

// 泛型约束
// 上界
fun <T: Comparable<T>> sort(list: List<T>){}


fun main() {
    // 泛型自动推导
    var wrapper = Wrapper(1)
}