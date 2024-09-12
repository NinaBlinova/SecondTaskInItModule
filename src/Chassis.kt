import java.util.Objects

class Chassis(val material: String, val wheelSize: Int) {
    // Переопределение метода equals(), чтобы сравивать м/д собой
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Chassis) return false
        return material == other.material && wheelSize == other.wheelSize
    }

    // Переопределение метода hashCode(), чтобы писваиваь id для шасси
    override fun hashCode(): Int {
        return 1
    }

    // Переопределение метода toString(), чтобы выводить информцию о шасси
    override fun toString(): String {
        return "Chassis(material : '$material', wheelSize : $wheelSize)"
    }
}