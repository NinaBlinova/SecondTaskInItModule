import java.util.Objects
import java.util.Random
import kotlin.math.absoluteValue

class Airplane(var path: String, var wings: Wing, var engine: Engine, var chassis: Chassis, var fly : Boolean) {

    // выводим информацию о самолете
    override fun toString(): String {
        return "Airplane [path: '$path',  ${wings.toString()}, '${engine.toString()}', '${chassis.toString()}', fly: '$fly']\n"
    }

    override fun hashCode(): Int {
        return Objects.hash(path, wings, engine, chassis).absoluteValue
    }

    fun fly() : Boolean {
        val random = Random()
        val flightTime = random.nextInt(18) + 3 // Рандомное число от 3 до 20
        println("Airplane with path $path took off and is expected to fly for $flightTime hours.")
        return true // You could return a boolean indicating success or failure of takeoff
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other !is Airplane) return false
        return path == other.path && wings.equals(other.wings)  && engine.equals(other.engine)  && chassis.equals(other.chassis)
    }
}