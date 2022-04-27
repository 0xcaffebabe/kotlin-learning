package classesobj

interface Service{
    // 接口属性
    val name: String
        get() = "service"

    fun list()

    // 接口默认方法
    fun defaultList(){
        println(this.list())
    }
}
// 接口继承
interface BaseService: Service{}

class UserService: Service {
    override val name: String = "user-service"
    override fun list() {
        TODO("Not yet implemented")
    }
}

// 函数式接口
fun interface Consumer {
    fun accept(i: Int)
}
fun main(){
    Consumer { println(it)}.accept(1)
}
