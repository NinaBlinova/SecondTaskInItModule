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
            false, // Изначально самолет не летает
        )

        airplanes.add(airplane)
        println("Airplane created: $airplane")
    }

    val tablo = Tablo(airplanes).removeDuplicates()
    print(tablo.toString() + "\n")

    tablo.forEach {
        println("Fly: Yes or no ... ")
        var inputFly = readLine()
        if (inputFly?.lowercase() == "yes") { // Используем lowercase() для сравнения
            it.fly()
        } else {
            println("Airplane with path ${it.path} is not taking off")
        }
    }

}