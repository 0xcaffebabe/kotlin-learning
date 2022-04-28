package classesobj

// 内联类：引入了一种新的类型，并且都在运行时表示为基础类型
// 构造器只允许一个参数 其在使用时会内被编译为其基础类型
@JvmInline
value class Password(val raw: String)