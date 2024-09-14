import java.util.Objects
import java.util.Random
import kotlin.math.absoluteValue

class Airplane(var path: String, var wings: Wing, var engine: Engine, var chassis: Chassis, var fly: Boolean) {

    // выводим информацию о самолете
    override fun toString(): String {
        return "Airplane [path: '$path',  ${wings.toString()}, '${engine.toString()}', '${chassis.toString()}', fly: '$fly']\n"
    }

    override fun hashCode(): Int {
        println(wings.hashCode())
        return wings.hashCode() + engine.hashCode() + chassis.hashCode() // + (Random().nextInt(18) + 3)
    }

    fun fly(): Boolean {
        println("Введите '1' для взлета или '2' для посадки:")
        val input = readLine()

        return when (input) {
            "1" -> {
                println("Самолет с маршрутом $path взлетел.")
                chassis.moveAway()
                engine.StartTheEnggine()
                true // Успешный взлет
            }
            "2" -> {
                println("Самолет с маршрутом $path приземляется.")
                chassis.moveClose()
                engine.TurtnOffTheEnggine()
                true // Успешная посадка
            }
            else -> {
                println("Некорректный выбор. Пожалуйста, введите '1' или '2'.")
                false // Ошибка выбора
            }
        }

    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other !is Airplane) return false
        return path == other.path && wings.equals(other.wings) && engine.equals(other.engine) && chassis.equals(other.chassis)
    }
}