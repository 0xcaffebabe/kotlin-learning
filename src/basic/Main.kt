package basic

// 函数定义
fun sum(a: Int, b: Int) = a + b

fun sum1(a: Int, b: Int): Int {
    return a + b
}

// 常量
val a: Int = 9527
// 变量
var b = 9527

// 返回值可空
fun parseInt(str: String): Int? {
    if (str == "1") {
        return 0
    }
    return null
}

fun main() {
    println("hello world")
    // 字符串模板
    println("${a},${b}")
    // if表达式
    println(if (1 > 2) 999 else 0)
    var str: Any = "cxk"
    // 类型检测
    if (str is String) {
        // 在该分支 str自动被转为String
        println(str.length)
    }
    // for循环
    for(item in listOf(1,2,3,4,5)) {
        println(item)
    }
    // case语句
    val ans = when(str) {
        "cxk" -> "jntm"
        else -> "unknow"
    }
    println(ans)
    // 区间
    println(1 in 1..10)
    // 集合包含
    println(1 in listOf(1,2,3))
    // 函数式基操
    println(listOf(1,2,3,4).map {it * it} .filter {it % 2 != 0})
    // 创建类实例
    val obj = Object()
}
