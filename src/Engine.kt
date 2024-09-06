import java.util.Objects

class Engine(val type: String, val power: Int) {
    // Переопределение метода equals(), чтобы была возможность сравнивать различные двигатели
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Engine) return false
        return type == other.type && power == other.power
    }

    // Переопределение метода hashCode(), чтобы давать id значение для двигателя
    override fun hashCode(): Int {
        return Objects.hash(type, power)
    }

    // Переопределение метода toString(), чтоьбы выводить информацию о двигателе
    override fun toString(): String {
        return "Engine(type : '$type', power : $power)"
    }
}