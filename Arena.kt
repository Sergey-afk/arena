fun main() {
    println("Введите имя персонажа")
    val name: String? = readLine()
    println("С этого момента боги назвали вас ${name} ")
    var class_name: String? = null
    while (class_name == null) {
        println("Выберите класс введя цыфру: \n1.Волшебник\n2.Воин\n3.Вор\n")
        class_name = when (readLine()) {
            "1" -> "Волшебник"
            "2" -> "Воин"
            "3" -> "Вор"
            else -> null
        }
    }
    println("Отныни ты $class_name")
}