//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val airplanes = mutableListOf<Airplane>() // Список самолетов

    var continueCreating = true

    while (continueCreating) {
        print("Input path (or 'exit' to stop): ")
        val input = readLine()

        if (input == "exit") {
            continueCreating = false
            break
        }

        // Получение данных о самолете из консоли
        print("Input wing lenght: ")
        val wingLenght = readLine()?.toDoubleOrNull() ?: 0.0
        print("Input wing area: ")
        val wingArea = readLine()?.toDoubleOrNull() ?: 0.0
        print("Input engine type: ")
        val engineType = readLine() ?: ""
        print("Input engine power: ")
        val enginePower = readLine()?.toIntOrNull() ?: 0
        print("Input chassis material: ")
        val chassisMaterial = readLine() ?: ""
        print("Input chassis wheel size: ")
        val chassisWheelSize = readLine()?.toIntOrNull() ?: 0

        // Создание самолета
        val airplane = Airplane(
            input!!,
            Wing(wingLenght, wingArea),
            Engine(engineType, enginePower),
            Chassis(chassisMaterial, chassisWheelSize),
            false // Изначально самолет не летает
        )

        airplanes.add(airplane)

        println("Airplane created: $airplane")
    }

    // Сравнение элементов списка
    var i = 1 // Начинаем со второго элемента
    while (i < airplanes.size) {
        val currentAirplane = airplanes[i]
        val previousAirplane = airplanes[i - 1]

        if (currentAirplane.equals(previousAirplane)) {
            println("Duplicate found: $currentAirplane")
            // Удаляем дубликат из списка
            airplanes.removeAt(i) // Удаляем текущий элемент
            // Не нужно делать шаг назад, так как список уже сдвинулся
        } else {
            i++ // Переходим к следующему элементу
        }
    }

    println("Airplanes created:")
    airplanes.forEach { println(it) }




   // print("Fly: Yes or no ... ")
    //val inputFly = readLine()


    /*
    // Получаем хеш-код самолета
    val airplaneId1 = airplane1.hashCode()

    // Ищем самолет по хеш-коду
    val foundAirplane1 = airplanes.find { it.hashCode() == airplaneId1 }

    println("Information about airplane with ID $airplaneId1: $foundAirplane1")
*/

}