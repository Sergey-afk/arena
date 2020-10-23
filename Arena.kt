fun main() {
    println("Введите имя персонажа")
    val name: String? = readLine()
    println("С этого момента боги назвали вас ${name} ")
    println("Выберите класс введя цыфру: \n1.Волшебник\n2.Воин\n3.Вор\n")
    val class_type: Int = readLine()
    var class_name: String?
    when (class_type) {
        1 -> println("Отныни ты Волшебник") //and class_name == ("Волшебник")
        2 -> println("Отныни ты Воин") //and class_name == ("Воин")
        3 -> println("Отныни ты Вор") //and class_name == ("Вор")

        else ->{
            println("Ошибка")
            return
        }
    }
    //---------------------------------------------------------
    when(class_type){
        1 -> class_name == ("Волшебник")
        2 -> class_name == ("Воин")
        3 -> class_name == ("Вор")

        else ->{
            println("Ошибка")
            return
        }
    }

}