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

    when (areHeSheMusicLover) {
        "да" -> {
            when (pastBuy) {
                in 0..1_000 -> {
                    println("Вы купили мелодию за  ${presentBuy * 0.99}")
                }
                in 1_001..10_000 -> {
                    println("Вы купили мелодию за  ${presentBuy * 0.99 - 100}")
                }
                in 10_001..1_000_000 -> {
                    println("Вы купили мелодию за  ${presentBuy - (presentBuy * 0.99 - presentBuy * 0.95)}")
                }
            }
        }
        "нет" -> {
            when (pastBuy) {
                in 0..1_000 -> {
                    println("Вы купили мелодию за  $presentBuy")
                }
                in 1_001..10_000 -> {
                    println("Вы купили мелодию за  ${presentBuy - 100}")
                }
                in 10_001..1_000_000 -> {
                    println("Вы купили мелодию за  ${presentBuy - presentBuy * 0.95}")
                }
            }
        }
    }
}