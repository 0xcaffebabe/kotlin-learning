package classesobj

class Item(){
    init {
        println("item init")
    }
}

// 编译期常量
const val PAGE_SIZE = 100

class Properties {
    var key: String = ""
    var value: String = ""

    // getter setter
    // 0是幕后属性
    var counter : Int = 0
        set(value) {field = value+1}
        get() {return ++field }

    // 延迟初始化属性
    lateinit var item: Item

    fun get(): Item? {
        if (::item.isInitialized) {
            return item
        }
        return null
    }
}

fun main(){
    var p = Properties()
    p.get()
}