class Tablo(airplanes: MutableList<Airplane>){
    // Используем список, переданный из конструктора
    private val airplanes = airplanes // Сохраняем список самолетов из конструктора

    fun removeDuplicates(): MutableList<Airplane> {
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
        return airplanes
    }

    override fun toString(): String {
        val sb = StringBuilder("Tablo(airplanes=")
        sb.append(airplanes.joinToString(", ", "[", "]"))
        sb.append(')')
        return sb.toString()
    }

}