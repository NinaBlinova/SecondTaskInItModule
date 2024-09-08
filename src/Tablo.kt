class Tablo(airplanes: MutableList<Airplane>){
    // Используем список, переданный из конструктора
    private val airplanes = airplanes // Сохраняем список самолетов из конструктора

    fun removeDuplicates(): MutableList<Airplane> {
        // Сравнение элементов списка
        val uniqueAirplanes = mutableListOf<Airplane>() // Создаем новый список для уникальных самолетов

        for (i in 0 until airplanes.size) {
            val currentAirplane = airplanes[i]
            var isDuplicate = false // Флаг, указывающий, является ли текущий самолет дубликатом

            // Проверяем, есть ли дубликат среди уже добавленных самолетов
            for (j in 0 until uniqueAirplanes.size) {
                if (currentAirplane.equals(uniqueAirplanes[j])) {
                    isDuplicate = true
                    break // Выходим из внутреннего цикла, если найден дубликат
                }
            }

            // Если текущий самолет не дубликат, добавляем его в список уникальных
            if (!isDuplicate) {
                uniqueAirplanes.add(currentAirplane)
            }
        }

        return uniqueAirplanes // Возвращаем список уникальных самолетов
    }


}