package classesobj

enum class Season(val desc: String) {
    SPRING("春"),
    SUMMER("夏"),
    AUTUMN("秋"),
    WINTER("冬"),

    // 匿名内部类
    QUANZHOU_AUTUMN("夏秋-秋夏") {}
}

fun main() {
    for (season in Season.values()) {
        println("${season.name} ${season.ordinal} ${season.desc}")
    }
}
