//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val airplanes = mutableListOf<Airplane>() // Список самолетов


    print("Input path: ")
    val input = readLine()

    val airplane1 = input?.let { Airplane(it, Wing(10, 20), Engine("Diesel", 150), Chassis("Steel", 18), false) }

    println(airplane1.toString())

    if (airplane1 != null) {
        airplanes.add(airplane1)
    }


    print("Fly: Yes or no ... ")
    val inputFly = readLine()

    if (inputFly == "yes") {
        if (airplane1 != null) {
            airplane1.fly = airplane1.fly(airplane1.hashCode())
        }
    }


    /*
    // Получаем хеш-код самолета
    val airplaneId1 = airplane1.hashCode()

    // Ищем самолет по хеш-коду
    val foundAirplane1 = airplanes.find { it.hashCode() == airplaneId1 }

    println("Information about airplane with ID $airplaneId1: $foundAirplane1")
*/

}