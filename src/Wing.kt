import java.util.Objects

class Wing(var lenght: Double, var area: Double) {
    // Переопределение метода toString(), необходим для вывода характеристики крыла
    override fun toString(): String {
        return "Wing: lenght = $lenght, area = $area"
    }

    // Переопределение метода equals(), сравнение крыльев двух самолетов, будет использоваться для сравнения самолетев
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Wing) return false
        // Проверяем, одинаковые ли значения lenght и area
        if (other.lenght == this.lenght && other.area == this.area) return true
        return false
    }

    // Переопределение метода hashCode(), чтобы задаывть id крыльев
    override fun hashCode(): Int {
        return lenght.hashCode() + area.hashCode()
    }

    // Функция для изменения информации о крыле
    fun updateWing(newLenght: Int, newArea: Int) {
        this.lenght = newLenght.toDouble()
        this.area = newArea.toDouble()
    }
}