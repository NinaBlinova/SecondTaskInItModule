import java.util.Objects

class Chassis(val material: String, val wheelSize: Int) {
    // Переопределение метода equals(), чтобы сравивать м/д собой
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Chassis) return false
        return material == other.material && wheelSize == other.wheelSize
    }

    // Переопределение метода hashCode()
    override fun hashCode(): Int {
        var result = material.hashCode() + wheelSize.hashCode()
        return result
    }

    fun moveAway() {
        println("Шасси отодвинуто.")
    }

    fun moveClose() {
        println("Шасси придвинуто.")
    }


    // Переопределение метода toString(), чтобы выводить информцию о шасси
    override fun toString(): String {
        return "Chassis(material : '$material', wheelSize : $wheelSize)"
    }
}