fun main() {
    println("Наш пользователь каждый месяц покупает пластинки? (да/нет)")
    val areHeSheMusicLover = readLine()
    //Определение "меломана"
    val discountPrice = when (areHeSheMusicLover == "да") {
        false -> 0
        true -> 1
    }
    println("Ваша сикдка гарантированная скидка - $discountPrice %")
    println("Сколько денег вы потратили у нас ранее? (укажите в рублях)")
    val pastBuy = readLine()!!.toInt()
    println("На какую суму вы покупаете песню (укажите в рублях)")
    val presentBuy = readLine()!!.toInt()

    when {
        areHeSheMusicLover == "да" -> {
            if (pastBuy in 0..1_000) {
                println("Вы купили мелодию за  ${presentBuy * 0.99}")
            } else if (pastBuy in 1_001..10_000) {
                println("Вы купили мелодию за  ${presentBuy * 0.99 - 100}")
            } else if (pastBuy in 10_001..1_000_000) {
                println("Вы купили мелодию за  ${presentBuy - (presentBuy * 0.99 - presentBuy * 0.95)}")
            }
        }
        areHeSheMusicLover == "нет" -> {
            if (pastBuy in 0..1_000) {
                println("Вы купили мелодию за  $presentBuy")
            } else if (pastBuy in 1_001..10_000) {
                println("Вы купили мелодию за  ${presentBuy - 100}")
            } else if (pastBuy in 10_001..1_000_000) {
                println("Вы купили мелодию за  ${presentBuy - presentBuy * 0.95}")
            }
        }
    }
}