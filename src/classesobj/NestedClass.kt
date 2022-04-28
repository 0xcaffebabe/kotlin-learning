package classesobj

class OuterClass {
    class Inner
    interface InnerInterface
    inner class InnerClass
}
// 匿名内部类
val r = Thread {
    run { println("jntm") }
}